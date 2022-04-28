
public class CheckoutLine {
   public cNode head;

   public CheckoutLine() {
      head = null;
   }

   public void enqueue(cNode cn) {
      cNode prev = head;
      cNode temp;
      if (head == null) head = cn;

      else if (head.getNext() == null) head.setNext(cn);

      else {
         boolean addToEnd = true;
         temp = prev;
         while (temp.getNext() != null) {
            if (temp.inFastLane!=cn.inFastLane && temp.getNext().inFastLane!=cn.inFastLane) {
               cn.setNext(temp.getNext());
               temp.setNext(cn);
               addToEnd = false;
               break;
            }
            temp = temp.getNext();
         }
         if (addToEnd)
            temp.setNext(cn);
         head = prev;
      }
   }

   public Customer dequeue() {
      Customer nextCustomer = null;
      if (head != null) {
         nextCustomer = head.getCustomer();
         head = head.getNext();
      }
      return nextCustomer;

   }

   public Customer peek() {
      Customer firstInline;

      try {
         firstInline = head.getCustomer();
      } catch (NullPointerException npe) {
         firstInline = null;
         System.out.println(npe.getMessage());
      }
      return firstInline;
   }

   public String toString() {

      if (head == null)
         return "No Customers";

      else {
         String listString = "";
         cNode temp = head;
         while (temp != null) {
            listString += temp.getCustomer().toString() + "\n";
            temp = temp.getNext();
         }
         return listString;

      }
   }
}