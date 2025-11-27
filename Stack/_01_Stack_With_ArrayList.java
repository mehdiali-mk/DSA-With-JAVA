import java.util.ArrayList;

public class _01_Stack_With_ArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("\n\nBasic Stack Implementation:");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        System.out.println("\n\n");
    }
}