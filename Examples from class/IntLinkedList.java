public class IntLinkedList
{
   private IntNode head;
   
   public void addToFront(int i)
   {
      IntNode theNode = new IntNode(i);
      theNode.setNext(head);
      head = theNode;
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
   
   public void printRec()
   {
      printRecPrivate(head);
   }
   private void printRecPrivate(IntNode current)
   {
      if(current!= null)
      {
         System.out.println(current.getData());
         printRecPrivate(current.getNext());
      }
   }

}