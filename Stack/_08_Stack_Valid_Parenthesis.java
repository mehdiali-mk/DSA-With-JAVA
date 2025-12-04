import java.util.Stack;

public class _08_Stack_Valid_Parenthesis {
    public static boolean checkValidParenthesis(String myString) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < myString.length(); i++) {
            char currentCharacter = myString.charAt(i);
            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                myStack.push(currentCharacter);
            } else {
                if (myStack.isEmpty())
                    return false;
                if (myStack.peek() == '(' && currentCharacter == ')' || myStack.peek() == '[' && currentCharacter == ']'
                        || myStack.peek() == '{' && currentCharacter == '}') {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }

        if (myStack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String myString = "({}[()])";

        System.out.println("\n\nString Parenthesis = " + myString);
        System.err.println("Is parenthesis valid = " + checkValidParenthesis(myString));

        myString = "(){])";
        System.out.println("\nString Parenthesis = " + myString);
        System.err.println("Is parenthesis valid = " + checkValidParenthesis(myString));

        System.out.println("\n\n");
    }
}
