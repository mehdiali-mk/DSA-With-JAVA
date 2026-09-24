public class _46_Is_Multiple_Of_3 {
    public static boolean isMultipleOf3(String s) {
        // code here
        // long number = 0;
        // for (long i = 0; i < s.length(); i++) {
        // number += (int) Math.pow(2, i) * (s.charAt(s.length() - 1 - i) - '0');
        // }

        // return number % 3 == 0;

        int number = 0;
        int power = 1;

        for (int i = 0; i < s.length(); i++) {
            number = (number + power * (s.charAt(s.length() - 1 - i) - '0')) % 3;
            power = (power * 2) % 3;
        }

        return number % 3 == 0;
    }

    public static void main(String args[]) {
        System.out.println(isMultipleOf3("0011"));
    }
}