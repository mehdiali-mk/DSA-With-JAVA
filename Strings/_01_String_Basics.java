package Strings;

import java.util.Scanner;

public class _01_String_Basics {

    public static void printAllCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(" " + str.charAt(i) + " ");
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        String myStr1 = "Mehdiali";
        String myStr2 = new String("Kadiwala");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your name = ");
        String name = sc.nextLine();

        System.out.println("\nYour name is " + name);
        System.out.println("Your name length is " + name.length());

        System.out.println("\nPrint Name Characters = ");
        printAllCharacter(name);
    }
}