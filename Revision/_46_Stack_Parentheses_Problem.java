import java.util.Stack;

public class _46_Stack_Parentheses_Problem {
    public static void main(String args[]) {
        String myParenthesesString = "[[{()}]]";
        String myOtherParenthesesString = "[[{{()}}{}([{}])[[";

        System.out.println("\n\n");
        System.out.println("Parentheses String: " + myParenthesesString);
        System.out.println("Parentheses Balanced: " + parenthesesBalance(myParenthesesString));
        System.out.println("\nParentheses String: " + myOtherParenthesesString);
        System.out.println("Parentheses Balanced: " + parenthesesBalance(myOtherParenthesesString));
        System.out.println("\n\n");
    }

    public static boolean parenthesesBalance(String myString) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < myString.length(); i++) {
            Character currentCharacter = myString.charAt(i);
            if (currentCharacter == '(' || currentCharacter == '[' || currentCharacter == '{') {
                myStack.push(currentCharacter);
            } else {
                switch (currentCharacter) {
                    case ')':
                        if (myStack.peek() != '(')
                            return false;
                        break;
                    case ']':
                        if (myStack.peek() != '[')
                            return false;
                        break;
                    case '}':
                        if (myStack.peek() != '{')
                            return false;
                        break;
                    default:
                        return false;
                }
                myStack.pop();
            }
        }

        return (myStack.isEmpty()) ? true : false;
    }
}
