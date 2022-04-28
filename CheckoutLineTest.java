import java.util.Scanner;

public class CheckoutLineTest {
    public static void main(String[] args) {
        CheckoutLine checkoutLine = new CheckoutLine();
        String menuOptions = "What would you like to do with the supermarket line?\n" +
                "1 – have a customer line up\n" +
                "2 – have a customer check out\n" +
                "3 – check who is in line\n" +
                "4 – quit\n";
        boolean checkingOnCustomers = true;
        Scanner sc = new Scanner(System.in);
        String name;
        int numItems;
        while (checkingOnCustomers) {
            System.out.println(menuOptions);
            int optionSelected = sc.nextInt();
            switch (optionSelected) {
                case 1:
                    System.out.println("What is the customer's first name");
                    name = sc.next();
                    System.out.println("and how many items do they have?");
                    numItems = sc.nextInt();
                    checkoutLine.enqueue(new cNode(new Customer(name, numItems)));
                    System.out.println(name+" with "+numItems+" items is in the "+(numItems > 15 ? "normal":"fast") +" lane");

                    break;
                case 2:
                    Customer nextCustomer = checkoutLine.dequeue();
                    name = nextCustomer.getName();
                    numItems = nextCustomer.getNumberOfItems();
                    System.out.println(name+" is checking out with "+numItems);
                    break;
                case 3:
                    System.out.println(checkoutLine);
                    break;
                case 4:
                    checkingOnCustomers = false;
                    break;

            }

        }

    }
}
