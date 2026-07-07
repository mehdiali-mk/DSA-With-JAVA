public class _18_Product_Array_Except_Self {
    public static void main(String args[]) {
        int myArray[] = { 1, 2, 3, 4, 5 };
        int productArray[] = findProductArray(myArray);

        System.out.print("\n\nOriginal Array: ");
        printArray(myArray);
        System.out.print("\nProduct Array: ");
        printArray(productArray);
        System.out.println("\n\n");
    }

    public static int[] findProductArray(int myArray[]) {
        int newProductArray[] = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            int currentProduct = 1;
            for (int j = 0; j < myArray.length; j++) {
                if (i == j)
                    continue;
                currentProduct *= myArray[j];
            }
            newProductArray[i] = currentProduct;
        }

        return newProductArray;
    }

    public static void printArray(int myArray[]) {
        System.out.print("[ ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + (i < myArray.length - 1 ? ", " : " "));
        }
        System.out.println("]");
    }
}
