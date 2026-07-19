public class _27_Doubly_LinkedList_Prepend {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        myDoublyLL.removeLast();
        myDoublyLL.prepend(50);
        myDoublyLL.prepend(40);
        myDoublyLL.prepend(30);
        System.out.println();
        myDoublyLL.printList();
        myDoublyLL.prepend(20);
        myDoublyLL.prepend(10);
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}
