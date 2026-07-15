public class _25_Doubly_LinkedList_Append {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        System.out.println("Head = " + myDoublyLL.getHeadNodeValue());
        System.out.println("Tail = " + myDoublyLL.getTailNodeValue());
        System.out.println("Length = " + myDoublyLL.getLength());
        System.out.println();
        myDoublyLL.printList();
        System.out.println();
        myDoublyLL.append(20);
        myDoublyLL.append(30);
        myDoublyLL.append(40);
        System.out.println();
        myDoublyLL.printList();
        System.out.println();
    }
}
