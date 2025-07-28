package Arrays;

public class _07_PairsInArray {
    public static void pairsInArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                System.out.print("(" + array[i] + ", " + array[j] + ") - ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };

        System.out.println();
        pairsInArray(array);
    }
}
