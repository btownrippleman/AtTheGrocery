public class Card 
{
   //Declare variables 
   int num;
   //overloaded constructor 
   public Card(int n)
   {
      num=n;
   }
   //method to get the number associated with the card 
   public int getCardNum()
   {
      return num;
   }
   //to string method for the card object 
   public String toString()
   {
         return ("Card: "+num+"\n");
   }
   
   
   
   
}