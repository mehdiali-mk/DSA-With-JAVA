public class _48_Shortest_Path_From_1_To_N {
    public static int minimumStep(int n) {
        // code here
        int countSteps = 0;
        while (n != 1) {
            if (n % 3 == 0) {
                n /= 3;
            } else {
                n--;
            }
            countSteps++;
        }

        return countSteps;
    }

    public static void main(String args[]) {
        System.out.println(minimumStep(120));
    }
}