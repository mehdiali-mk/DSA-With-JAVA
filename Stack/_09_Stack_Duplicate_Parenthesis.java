import java.util.Stack;

public class _09_Stack_Duplicate_Parenthesis {
    public static Boolean checkDuplicateParenthesis(String myString) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != ')') {
                myStack.push(myString.charAt(i));
            } else {
                int count = 0;
                while (myStack.peek() != '(') {
                    myStack.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }
                myStack.pop();
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String myString = "((a+b)+(c+d))";
        String myString2 = "((a+b)+((c+d)))";

        System.out.println("\n\nOriginal String = " + myString);
        System.out.println("Duplicate Parenthesis = " + checkDuplicateParenthesis(myString));

        System.out.println("\nOriginal String = " + myString2);
        System.out.println("Duplicate Parenthesis = " + checkDuplicateParenthesis(myString2));

        System.out.println("\n\n");
    }

}