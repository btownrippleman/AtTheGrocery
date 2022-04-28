public class CustomerTest
{
   public static void main(String[] args)
   {
      Customer tako=new Customer("Tako", 8);
      Customer mushi=new Customer("Mushi", 4);
      cNode takoNode=new cNode(tako);
      cNode mushiNode=new cNode(mushi);
      CheckoutLine checkoutLine=new CheckoutLine();
      
      checkoutLine.enqueue(takoNode);
      checkoutLine.enqueue(mushiNode);
      
      System.out.println(checkoutLine);
   }
}                                              