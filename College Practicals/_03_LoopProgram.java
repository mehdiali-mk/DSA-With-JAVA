// * 3. Write a simple Java program using loops.

public class _03_LoopProgram {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Printing numbers from 10 to 1:");
        int j = 10;
        while (j >= 1) {
            System.out.print(j + " ");
            j--;
        }
        System.out.println();

        System.out.println("Printing numbers from 1 to 10 with a do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
        System.out.println();
    }
}