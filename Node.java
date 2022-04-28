public class Node
{
   //Declare variables 
   Card c;
   Node n;
   //default constructor 
   public Node()
      {
         c=null;
      }
   //overloaded constructor 
   public Node(int num)
      {
         this.c=new Card(num);
      }
   //method to return the card associated with the node 
   public Card getCard()
      {
         return c;
      } 
   //method to set a card object to be associated with the node  
   public void setCard(Card c)
      {
         this.c = c;
      }
      //method to return node n 
   public Node getNext()
      {
         return n;
      }
   //method to set the node n to a new node with the value next 
   public void setNext(Node newNext)
      {
         n=newNext;
      }
       

}