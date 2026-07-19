public class _30_Doubly_LinkedList_Set {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        myDoublyLL.append(20);
        myDoublyLL.append(30);
        myDoublyLL.append(40);
        myDoublyLL.append(50);

        System.out.println();
        myDoublyLL.printList();

        myDoublyLL.set(0, 100);
        myDoublyLL.set(2, 300);
        myDoublyLL.set(4, 500);

        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}
