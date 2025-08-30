public class _09_Fast_Exponential {
    public static int getExponential(int number, int power) {
        int currentMultiplication = number;
        int answer = 1;
        while (power != 0) {
            if ((power & 1) == 1) {
                answer = answer * currentMultiplication;
            }
            currentMultiplication *= currentMultiplication;
            power = power >> 1;
        }

        return answer;
    }

    public static void main(String args[]) {
        int number = 3, power = 5;

        System.out.println("\n\n" + number + " power " + power + " = " + getExponential(number, power));

        number = 5;
        power = 6;
        System.out.println(number + " power " + power + " = " + getExponential(number, power) + "\n\n");
    }
}
