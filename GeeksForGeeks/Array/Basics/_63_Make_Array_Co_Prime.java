public class _63_Make_Array_Co_Prime {

    public static int countCoPrime(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (!isCoPrime(arr[i], arr[i + 1])) {
                count++;
            }
        }

        return count;
    }

    public static boolean isCoPrime(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a == 1;
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 2, 7, 28 };

        System.out.println(countCoPrime(myArray));
    }
}
