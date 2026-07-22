public class _39_Stack_Push {
    public static void main(String args[]) {
        Stack myStack = new Stack(10);

        System.out.println("\n\n");
        myStack.printStack();
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.printStack();
        System.out.println("\n\n");
    }
}
