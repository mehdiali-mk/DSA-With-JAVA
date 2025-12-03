import java.util.Stack;

public class _07_Stack_Next_Greater {
    public static int[] findNextGreater(int array[]) {
        Stack<Integer> myStack = new Stack<>();
        int nextGreater[] = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            while (!myStack.isEmpty() && array[myStack.peek()] <= array[i]) {
                myStack.pop();
            }

            if (myStack.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = array[myStack.peek()];
            }

            myStack.push(i);
        }

        return nextGreater;
    }

    public static void displayArray(int array[]) {
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String args[]) {
        int elements[] = { 6, 8, 0, 1, 3 };

        System.out.println("\n\nOriginal Elements: ");
        displayArray(elements);

        int nextGreater[] = findNextGreater(elements);

        System.out.println("\nNext Greater Elements: ");
        displayArray(nextGreater);

        System.out.println("\n\n");
    }
}