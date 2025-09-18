// * Binary Strings Problem
// Print all binary strings of size N without consecutive ones.

package Recursion;

public class _14_Binary_String {
    static void dispalyBinaryString(int binaryNumber, int lastPlace, String binaryString) {
        if (binaryNumber == 0) {
            System.out.println(binaryString);
            return;
        }

        dispalyBinaryString(binaryNumber - 1, 0, binaryString + "0");
        if (lastPlace == 0) {
            dispalyBinaryString(binaryNumber - 1, 1, binaryString + "1");
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\nBinary String of 3:\n");
        dispalyBinaryString(3, 0, "");
        System.out.println("\n\n");
    }
}
