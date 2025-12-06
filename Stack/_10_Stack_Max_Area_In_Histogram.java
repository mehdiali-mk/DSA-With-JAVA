import java.util.Stack;

public class _10_Stack_Max_Area_In_Histogram {
    public static int findMaximumArea(int heights[]) {
        int maximumArea = 0;
        int nextSmallestLeft[] = new int[heights.length];
        int nextSmallestRight[] = new int[heights.length];

        Stack<Integer> s = new Stack<>();

        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallestRight[i] = -1;
            } else {
                nextSmallestRight[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallestLeft[i] = -1;
            } else {
                nextSmallestLeft[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nextSmallestRight[i] - nextSmallestLeft[i] - 1;
            int currentArea = height * width;

            maximumArea = Math.max(maximumArea, currentArea);
        }

        return maximumArea;
    }

    public static void displayArray(int array[]) {
        System.out.print(" [ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String args[]) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        int maxArea = findMaximumArea(heights);

        System.out.print("\n\nHistogram heights = ");
        displayArray(heights);
        System.out.println("\nMaximum area = " + maxArea + "\n\n");
    }
}
