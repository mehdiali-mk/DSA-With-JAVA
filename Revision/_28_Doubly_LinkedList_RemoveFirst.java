public class _28_Doubly_LinkedList_RemoveFirst {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        System.out.println("Remove First: " + myDoublyLL.removeFirst());
        myDoublyLL.append(10);
        myDoublyLL.append(20);
        myDoublyLL.append(30);
        myDoublyLL.append(40);
        myDoublyLL.append(50);
        System.out.println("");
        myDoublyLL.printList();
        System.out.println("\n\n");
        System.out.println("Remove First: " + myDoublyLL.removeFirst());
        System.out.println("Remove First: " + myDoublyLL.removeFirst());
        System.out.println("Remove First: " + myDoublyLL.removeFirst());
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}
