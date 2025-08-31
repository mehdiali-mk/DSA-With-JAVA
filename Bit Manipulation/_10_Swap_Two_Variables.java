public class _10_Swap_Two_Variables {

    public static void main(String agrs[]) {
        int num1 = 3, num2 = 7;

        System.out.println("\n\nBefore Swap: num1 = " + num1 + " num2 = " + num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println(" After Swap: num1 = " + num1 + " num2 = " + num2 + "\n\n");
    }
}
