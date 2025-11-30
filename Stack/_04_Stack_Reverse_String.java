import java.util.*;

public class _04_Stack_Reverse_String {
    public static String reverseString(String myString) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < myString.length(); i++) {
            myStack.push(myString.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!myStack.isEmpty()) {
            reversedString.append(myStack.pop());
        }

        return reversedString.toString();
    }

    public static void main(String args[]) {
        String str = "Mehdiali Kadiwala";

        System.out.println("\n\nOriginal String: " + str);
        String reversedString = reverseString(str);
        System.out.println("\nReversed String: " + reversedString + "\n\n");
    }
}
