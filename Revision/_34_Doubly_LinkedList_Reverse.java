public class _34_Doubly_LinkedList_Reverse {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(1);

        myDoublyLL.append(2);
        myDoublyLL.append(3);
        myDoublyLL.append(4);
        myDoublyLL.append(5);
        System.out.println();
        myDoublyLL.printList();
        myDoublyLL.reverse();
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}