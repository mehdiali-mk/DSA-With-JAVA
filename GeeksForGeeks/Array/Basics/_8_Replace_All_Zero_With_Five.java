public class _8_Replace_All_Zero_With_Five {
    public static int convertFive(int n) {
        // code here
        String number = String.valueOf(n);
        number = number.replace('0', '5');
        return Integer.parseInt(number);
    }

    public static void main(String args[]) {
        System.out.println(convertFive(1200));
    }
}