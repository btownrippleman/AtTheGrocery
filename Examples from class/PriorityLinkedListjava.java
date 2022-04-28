public class PriorityLinkedListjava
{
   private IntNode head;
   public void addToFront(int i)
   {
      IntNode theNode=new IntNode(i);
      theNode.setNext(head);
      head=theNode;
   }
   public void add(int value)
   {
      IntNode current = head;
      
      if(current == null)
      {
         addToFront(value);
         return;
      }
      
      if(current.getData() > value)
      {
         addAtIndex(value,0);
         return;
      }
      
      int counter = 0;
      while(current != null)
      {
         System.out.println("comparing: "+current.getData()+" "+value);
      
         if(current.getData() > value)
         {
            System.out.println(value+" "+counter);
            addAtIndex(value,counter);
            return;
         }
         current = current.getNext();
         counter++;
      }
      if(current == null) //end of list
      {
         addAtIndex(value,counter);
      }
   }
   public void addAtIndex(int value, int index)
   {
      if(index == 0) //special case if front
      {
         addToFront(value);
         return;
      }  
      
      //otherwise traverse until get to the index you are looking for.
      IntNode current = head;
      
      for(int i=0;i<index-1;i++)
      {
         current = current.getNext();
      }
      
      IntNode newNode = new IntNode(value);
      newNode.setNext(current.getNext());
      current.setNext(newNode);
   }
   //returns true if delete was successful
   public boolean removeItem(int i)
   {
      if(head == null)
         return false;  
      IntNode current = head;
      IntNode prev = head;
      //traverse until we find then item we are looking for (or until the end of  the list)
      while(current != null && current.getData() != i)
      {
         prev = current;
         current = current.getNext();
      }
      if(current == null)
         return false;
         
      if(head == current) //special case if removing head
      {
         head = head.getNext();
         return true;
      }
      prev.setNext(current.getNext());
      return true;
   }
   
  
   public void print()
   {
      IntNode current = head;
      
      while(current != null)
      {
         System.out.println(current.getData());
         current = current.getNext();
      }
   }
}