import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _08_Queue_Reverse {
    public static void reverseQueue(Queue<Integer> myQueue) {
        Stack<Integer> s = new Stack<>();

        while (!myQueue.isEmpty()) {
            s.push(myQueue.remove());
        }

        while (!s.isEmpty()) {
            myQueue.add(s.pop());
        }
    }

    public static void main(String args[]) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);

        System.out.println("\n\nOriginal Queue = " + myQueue);
        reverseQueue(myQueue);
        System.out.println("\nReversed Queue = " + myQueue + "\n\n");
    }
}