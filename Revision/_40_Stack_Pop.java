public class _40_Stack_Pop {
    public static void main(String args[]) {
        Stack myStack = new Stack(10);

        System.out.println("\n\n");
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.printStack();

        myStack.pop();
        myStack.pop();

        myStack.printStack();

        System.out.println("\n\n");
    }
}
