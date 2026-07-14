public class _24_Doubly_LinkedList_Constructor {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        System.out.println("Head = " + myDoublyLL.getHeadNodeValue());
        System.out.println("Tail = " + myDoublyLL.getTailNodeValue());
        System.out.println("Length = " + myDoublyLL.getLength());
        System.out.println("\n\n");
        myDoublyLL.printList();
    }
}
