package Strings;

import java.util.Scanner;

public class _02_Check_Palindrome {

    public static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter you string = ");
        String str = sc.next();

        if (checkPalindrome(str)) {
            System.out.println("\nYour string " + str + " is Palindrome.\n\n");

        } else {
            System.out.println("\nYour string " + str + " is not Palindrome.\n\n");
        }

    }
}
