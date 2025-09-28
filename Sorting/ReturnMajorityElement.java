package Sorting;

public class ReturnMajorityElement {
    public static void displayArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.err.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }

    public static int majorityElement(int array[]) {
        int majorityCount = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return array[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("\n\nOriginal Array:");
        displayArray(array);
        System.out.println("\nMajority Element is = " + majorityElement(array) + "\n\n");
    }
}
