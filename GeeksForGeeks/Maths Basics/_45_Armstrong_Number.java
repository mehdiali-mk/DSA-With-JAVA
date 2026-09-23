public class _45_Armstrong_Number {
    public static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;

        int tempNumber = n;

        while (tempNumber != 0) {
            int reminder = tempNumber % 10;
            tempNumber /= 10;
            sum += Math.pow(reminder, 3);
        }

        return sum == n;
    }

    public static void main(String args[]) {
        System.out.println(armstrongNumber(153));
    }
}