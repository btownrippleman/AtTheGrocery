public class cNode 
{
   public cNode next;
   public Customer customer;
   
   //Default constructor 
   public cNode()
      {  
         super();
         customer=null;
      }

   //Overloaded constructor 
   public cNode(Customer c)
      {
         customer=c;
      }
      
   //method to set a Customer object to be associated with the cNode  
   public void setCustomer(Customer c)
      {
         customer = c;     
      }
   //Method to get the customer
   public Customer getCustomer()
      {
         return customer;     
      }
      
   //method to return cNode cN 
   public cNode getNext()
      {
         return next;
      }

   //method to set the node n to a new node with the value next 
   public void setNext(cNode newNext)
      {
         next=newNext;
      }
  public String toString()
  {
  return customer.toString();
  }
  
  public int lineCount()
   {
      if(next==null)
      {
         return 0;
      }
      int count=1;
      while(next.getNext()!=null)
      {
         next=next.getNext();
         count++;
      }
      return count;
   }


}