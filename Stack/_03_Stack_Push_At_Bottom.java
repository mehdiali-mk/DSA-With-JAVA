import java.util.*;

public class _03_Stack_Push_At_Bottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        System.out.println("\n\nStack Elements are:");
        while (s.isEmpty() != true) {
            System.out.println(s.pop());
        }
        System.out.println("\n\n");
    }
}