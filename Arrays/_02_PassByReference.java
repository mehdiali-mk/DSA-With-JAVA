package Arrays;

public class _02_PassByReference {
    public static void updateArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        updateArray(array);

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("\n\n");
    }
}
