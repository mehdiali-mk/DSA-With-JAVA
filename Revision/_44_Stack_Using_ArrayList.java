import java.util.ArrayList;

public class _44_Stack_Using_ArrayList {
    public static void main(String agrs[]) {
        Stack myStack = new Stack(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println("\n\n");
        myStack.printStack();

        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println("");
        myStack.printStack();
        System.out.println("\n\n");

    }

    public static class Stack {
        private ArrayList<Integer> myArrayList = new ArrayList<>();

        Stack(int value) {
            myArrayList.add(value);
        }

        public void push(int value) {
            myArrayList.add(value);
        }

        public int pop() {
            return myArrayList.remove(myArrayList.size() - 1);
        }

        public int getTopValue() {
            if (myArrayList.size() == 0) {
                System.out.println("Empty Stack");
                return -1;
            }

            return myArrayList.get(myArrayList.size() - 1);
        }

        public void getTop() {
            System.out.println("Top: " + getTopValue());
        }

        public void printStack() {
            System.out.print("\nPrint Stack: ");
            for (int i = 0; i < myArrayList.size(); i++) {
                System.out.print(myArrayList.get(i) + (i != myArrayList.size() - 1 ? " -> " : " "));
            }
            System.out.println();
        }
    }
}
