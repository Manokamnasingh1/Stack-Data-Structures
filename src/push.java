import java.util.Stack;

public class push {
    public static void main(String[] args){
        // creating an stack
        Stack<Integer> stk= new Stack<>();
        // checking the stack is empty or not
        boolean result = stk.empty();

        System.out.println("Is the stack empty? " + result);
        //pushing element into stack
        stk.push(98);
        stk.push(98);
        stk.push(78);
        stk.push(88);


        //print the stack
        System.out.println("element in stak " + stk);

        // element at top of the stack
        Integer num = stk.peek();
        System.out.println("Element at top: " + num);

        // search element int stack
         int location = stk.search("78");
        System.out.println("Location of 78: " + location);

        // Find the size of the Stack
        int x=stk.size();
        System.out.println("The stack size is: "+x);

        //




    }
}
