/*
 * 8. Write a Java program for method overloading.
 */

public class _08_MethodOverloading {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public static String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5 and 10: " + add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + add(5, 10, 15));
        System.out.println("Sum of 3.5 and 2.5: " + add(3.5, 2.5));
        System.out.println("Concatenated string: " + add("Hello", " World"));
    }
}
