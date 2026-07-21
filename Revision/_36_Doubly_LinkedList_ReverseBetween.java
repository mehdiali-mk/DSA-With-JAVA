public class _36_Doubly_LinkedList_ReverseBetween {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(1);

        myDoublyLL.append(2);
        myDoublyLL.append(3);
        myDoublyLL.append(4);
        myDoublyLL.append(5);
        myDoublyLL.append(6);
        System.out.println("\n");
        myDoublyLL.printList();
        myDoublyLL.reverseBetween(2, 5);
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}