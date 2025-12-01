import java.util.Stack;

public class _05_Stack_Reverse {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void displayStack(Stack<Integer> s) {
        @SuppressWarnings("unchecked")
        Stack<Integer> printStack = (Stack<Integer>) s.clone();
        while (!printStack.isEmpty()) {
            System.out.println(printStack.pop());
        }
    }

    public static void main(String args[]) {
        Stack<Integer> myStack = new Stack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println("\n\nOriginal Stack:");
        displayStack(myStack);

        reverseStack(myStack);

        System.out.println("\nReversed Stack:");
        displayStack(myStack);
        System.out.println("\n\n");
    }
}
