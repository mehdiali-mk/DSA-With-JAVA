/*
Question 1 :
Palindrome Linked List
We have a singly linked list of characters, write a function that returns true if the given list is a
palindrome, else false.

Input : A->B->C->B->A
Output : Yes It is Palindrome

*/

import java.util.LinkedList;
import java.util.Stack;

public class _11_Stack_LinkedList_Palindrome {
    public static void displayLinkedList(LinkedList<Character> myLinkedList) {
        for (int i = 0; i < myLinkedList.size(); i++) {
            if (i != 0) {
                System.out.print(" -> ");
            }
            System.out.print(myLinkedList.get(i));
        }
        System.out.println("\n");
    }

    public static Boolean isPalindrome(LinkedList<Character> myLinkedList) {
        Stack<Character> myStack = new Stack<>();

        Boolean isSizeEven = myLinkedList.size() % 2 == 0;

        int middleSize = isSizeEven ? myLinkedList.size() / 2 : (myLinkedList.size() / 2) + 1;

        for (int i = 0; i < middleSize; i++) {
            myStack.push(myLinkedList.removeFirst());
        }

        if (!isSizeEven) {
            myStack.pop();
        }
        while (!myStack.isEmpty()) {
            if (myStack.peek() != myLinkedList.peek()) {
                return false;
            }
            myStack.pop();
            myLinkedList.removeFirst();
        }

        return true;
    }

    public static void main(String args[]) {
        LinkedList<Character> myLinkedList = new LinkedList<>();

        myLinkedList.add('A');
        myLinkedList.add('B');
        myLinkedList.add('C');
        myLinkedList.add('B');
        myLinkedList.add('A');

        System.out.println("\n\nOriginal Linked List:");
        displayLinkedList(myLinkedList);

        System.out.println("Is Linked List palindrome = " + isPalindrome(myLinkedList));
        System.out.println("\n\n");
    }
}