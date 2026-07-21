public class _37_Doubly_LinkedList_SwapPairs {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(1);

        myDoublyLL.append(2);
        myDoublyLL.append(3);
        myDoublyLL.append(4);
        myDoublyLL.append(5);
        // myDoublyLL.append(6);
        System.out.println("\n");
        myDoublyLL.printList();
        myDoublyLL.swapPairs();
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}