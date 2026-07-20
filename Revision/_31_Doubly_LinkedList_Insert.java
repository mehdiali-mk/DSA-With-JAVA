public class _31_Doubly_LinkedList_Insert {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        myDoublyLL.append(20);
        myDoublyLL.append(30);
        myDoublyLL.append(40);
        myDoublyLL.append(50);

        System.out.println();
        myDoublyLL.printList();

        myDoublyLL.insert(5, 500);
        myDoublyLL.insert(0, 100);
        myDoublyLL.insert(2, 300);

        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}
