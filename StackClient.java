public class StackClient
{
   public static void main(String[] args)
   {
     //Instantiate a new stack object 
     Stack stack=new Stack();
      //A for loop to push the first six nodes into the stack 
      for(int i=1; i<7; i++){ stack.push(new Node(i)); }
      //Printing the stack
      System.out.println(stack);
      for(int i=0; i<3; i++){ stack.pop();}
      //Printing only the top of the stack with the peek method
      System.out.println(stack.peek());
      //Pushing 7, 8 and 9 into the stack with a for loop
      for(int i=7; i<10; i++){ stack.push(new Node(i)); }
      //Printing to verify it's complete
      System.out.println(stack);
    }
}