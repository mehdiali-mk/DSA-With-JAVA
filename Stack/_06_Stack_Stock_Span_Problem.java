import java.util.Stack;

public class _06_Stack_Stock_Span_Problem {

    public static void stockSpan(int stocks[], int spans[]) {
        Stack<Integer> stack = new Stack<>();

        spans[0] = 1;
        stack.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currentPrice = stocks[i];

            while (!stack.isEmpty() && currentPrice > stocks[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                spans[i] = i + 1;
            } else {
                int highestPrice = stack.peek();
                spans[i] = i - highestPrice;
            }

            stack.push(i);
        }
    }

    public static void main(String args[]) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int spans[] = new int[stocks.length];

        stockSpan(stocks, spans);

        System.out.println("\n\nStocks Span:");
        for (int span : spans) {
            System.out.print(span + " ");
        }
        System.out.println("\n\n");
    }
}
