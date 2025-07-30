package Arrays;

public class _09_SubArraysSum {
    public static void subArrays(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; j > i; j--) {
                System.out.print("(");
                int sum = 0;
                for (int k = i; k < j; k++) {
                    System.out.print(" " + array[k] + " ");
                    sum += array[k];
                }
                System.out.println(") = " + sum);
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };

        subArrays(array);
    }
}
