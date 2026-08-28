/*
 * Check for Power
 * 
 * Given two positive integers x and y, determine if y is a power of x. If y is
 * a power of x, return true. Otherwise, return false.
 * 
 * Examples:
 * 
 * Input: x = 2, y = 8
 * Output: true
 * Explanation: 23 is equal to 8.
 * 
 * Input: x = 1, y = 8
 * Output: false
 * Explanation: Any power of 1 is not equal to 8.
 */

public class _2_Check_For_Power {
    public static boolean isPower(int x, int y) {

        if (x == 1)
            return y == 1;
        if (x == 0)
            return y == 0; // 0 to any power (>0) is 0
        if (y <= 0)
            return false; // Assuming we are looking for positive integer powers

        // Keep dividing y by x as long as there is no remainder
        while (y % x == 0) {
            y /= x;
        }

        // If we successfully divided y down to 1, it's a perfect power
        return y == 1;
    }

    public static void main(String args[]) {
        System.out.println(isPower(2, 12));
    }
}