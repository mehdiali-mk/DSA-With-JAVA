package Recursion;

public class _16_Number_To_Text {
    static String digitsText[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static String numberToText(int number, StringBuilder sb) {
        if (number == 0) {
            return sb.toString();
        }

        sb.append(digitsText[number % 10] + " ");
        return numberToText(number / 10, sb);
    }

    public static void main(String args[]) {
        System.out.println("\n\nNumber to Text.");
        System.out.println("1478 = " + numberToText(1478, new StringBuilder()));
        System.out.println("309 = " + numberToText(309, new StringBuilder()));
        System.out.println("2365 = " + numberToText(2365, new StringBuilder()));
        System.out.println("357951 = " + numberToText(357951, new StringBuilder()) + "\n\n");
    }
}
