import java.util.Deque;
import java.util.LinkedList;

public class _09_Deque {
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(1);
        System.out.println("\n\nDeque ADD = " + deque);

        deque.removeFirst();
        deque.removeFirst();
        deque.removeLast();
        deque.removeLast();
        System.out.println("Deque REMOVE = " + deque + "\n\n");
    }
}
