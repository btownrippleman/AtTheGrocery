public class Customer
{

   //Declare variables   
   protected String name=new String("");
   protected int numberOfItems;
   boolean fastTrack=false;
   //Overloaded constructor
   public Customer(String name, int numItems)
   {
   this.name=name;
   numberOfItems=numItems;
   }
   
   public int getNumberOfItems()
   {
   return numberOfItems;
   }
     
   public String getName()
   {
   return name;
   }
     
   public String toString()
   {
      return ("Name: "+name+" \\ Items: "+numberOfItems);
   }
}