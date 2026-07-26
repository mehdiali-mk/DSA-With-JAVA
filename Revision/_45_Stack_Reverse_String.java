import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class _45_Stack_Reverse_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter string = ");
        String myString = sc.nextLine();

        System.out.println("\n\nOriginal String = " + myString);
        myString = reverseString(myString);
        System.out.println("Reversed String = " + myString);
        System.out.println("\n\n");
    }

    public static String reverseString(String myString) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < myString.length(); i++) {
            myStack.push(myString.charAt(i));
        }

        StringBuilder myReversedString = new StringBuilder();
        while (!myStack.isEmpty()) {
            myReversedString.append(myStack.pop());
        }

        return myReversedString.toString();
    }
    // public static String reverseString(String myString) {
    // Stack myStack = new Stack(myString.charAt(0));
    // for (int i = 1; i < myString.length(); i++) {
    // myStack.push(myString.charAt(i));
    // }

    // String myReverseString = "";

    // for (int i = 0; i < myString.length(); i++) {
    // myReverseString = myReverseString + myStack.pop();
    // }

    // return myReverseString;
    // }

    // public static class Stack {
    // private ArrayList<Character> myArrayList = new ArrayList<>();

    // Stack(char character) {
    // myArrayList.add(character);
    // }

    // public void push(char character) {
    // myArrayList.add(character);
    // }

    // public char pop() {
    // return myArrayList.remove(myArrayList.size() - 1);
    // }

    // public char getTopValue() {
    // if (myArrayList.size() == 0) {
    // System.out.println("Empty Stack");
    // return '-';
    // }

    // return myArrayList.get(myArrayList.size() - 1);
    // }

    // public void getTop() {
    // System.out.println("Top: " + getTopValue());
    // }

    // public int getLengthValue() {
    // return myArrayList.size();
    // }

    // public void printStack() {
    // System.out.print("\nPrint Stack: ");
    // for (int i = 0; i < myArrayList.size(); i++) {
    // System.out.print(myArrayList.get(i) + (i != myArrayList.size() - 1 ? " -> " :
    // " "));
    // }
    // System.out.println();
    // }
    // }
}
