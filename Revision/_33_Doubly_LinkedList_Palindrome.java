public class _33_Doubly_LinkedList_Palindrome {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(1);

        myDoublyLL.append(2);
        myDoublyLL.append(3);
        myDoublyLL.append(2);
        myDoublyLL.append(1);
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\nIs Palindrome = " + myDoublyLL.isPalindrome());
    }
}