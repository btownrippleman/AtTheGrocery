
public class CheckoutLine {
   public cNode head;

   public CheckoutLine() {
      head = null;
   }

   public void enqueue(cNode cn) {
      cNode prev = head;
      cNode temp;

      if (head == null)
         head = cn;
      else if (head.getNext() == null) {
         if (cn.getCustomer().getNumberOfItems() <= 15 && head.getCustomer().getNumberOfItems()>15) {
            cn.setNext(prev);
            head = cn;
         } else {
            head.setNext(cn);
         }
      }
      // else if (cn.getCustomer().getNumberOfItems() < 15 &&
      // head.getCustomer().getNumberOfItems() >15 &&
      // head.getNext().getCustomer().getNumberOfItems() >15)
      // {cn.setNext(head.getNext());head.setNext(cn);}
      else if (cn.getCustomer().getNumberOfItems() <= 15) {
         boolean addToEnd = true;
         temp = prev;
         while (temp.getNext() != null) {
            if (temp.getCustomer().getNumberOfItems() > 15 && temp.getNext().getCustomer().getNumberOfItems() > 15) {
               cn.setNext(temp.getNext());
               temp.setNext(cn);
               addToEnd = false;
               break;
            }
            System.out.println("not broken");
            temp = temp.getNext();
         }
         if (addToEnd)
            temp.setNext(cn);
         head = prev;
      }

      else {
         boolean addToEnd = true;
         temp = prev;
         while (temp.getNext() != null) {
            if (temp.getCustomer().getNumberOfItems() <= 15 && temp.getNext().getCustomer().getNumberOfItems() <= 15) {
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