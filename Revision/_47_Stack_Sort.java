import java.util.Stack;

public class _47_Stack_Sort {
    public static void main(String args[]) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(2);
        myStack.push(1);
        myStack.push(3);
        myStack.push(5);
        myStack.push(4);

        System.out.println("\n\n");
        System.out.println("Original Stack = " + myStack);

        myStack = sortStack(myStack);

        System.out.println("Sorted Stack   = " + myStack);

        System.out.println("\n\n");
    }

    public static Stack<Integer> sortStack(Stack<Integer> myStack) {
        Stack<Integer> tempStack = new Stack<>();

        tempStack.push(myStack.pop());

        while (!myStack.isEmpty()) {
            int currentValue = myStack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > currentValue) {
                myStack.push(tempStack.pop());
            }

            tempStack.push(currentValue);
        }

        return tempStack;
    }
}
