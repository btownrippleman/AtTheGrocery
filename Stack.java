public class Stack
{
   //instantiate variables 
   Node n;
   int numberOfItems=0;
  
   //default constructor 
   public Stack()
   {
      n=null;      
   }
   //overloaded constructor with a counter to keep track of how many are made 
   public Stack(Node n)
   {
      this.n=n;
      numberOfItems++;  //keeping track of the number of nodes made 
   }

   //push method
   public void push(Node n)
   {
      //Node tempN=new Node(n.getCard().getCardNum());
      Node tempN=new Node();
      tempN=n;

      tempN.setNext(this.n); //the second element in Tempe in is everything we know to be associated with the link list starting with N 
      this.n=tempN;  //now that temp N has the new value in front, set the original linked list value to the value of tempN 
      numberOfItems++;
   }
   
   //pop method
   public void pop()
      {
         //provided the current no it is not null, the current node is popped off 
         if(n!=null)
         {
         
         n=n.getNext(); //the front of the list is now the second element in the list 
         numberOfItems--;  //Decrement the number of items to keep up with bookkeeping            
      }
         
   }
   
   //peek method
   public Card peek() 
         {               
               try
               {
               return n.getCard();  //try to get The card associated with the current node at the front 
               }
               catch(NullPointerException npe)
               {
                  System.out.println(npe.getMessage());  //in the event that the current node is null then a message will be  printed out 
               }
               return null;   //make Java happy by returning something 
         }
      
   
   //isEmpty method
   public boolean isEmpty()
   {
      return (numberOfItems==0); //if there are no items in the list then the node N is null 
   }
   
   public String toString()
   {
      Node current=n;
      String temp=new String("\n");
      while(current!=null)
      {
         //initially, this method was deleting my entire list .  now it is situated appropriately 
         temp+=current.getCard();
         current=current.getNext();
         
      }
      
      return temp;   //Return the concatenated string 
   }
   

}