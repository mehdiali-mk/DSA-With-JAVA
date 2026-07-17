public class _26_Doubly_LinkedList_RemoveLast {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        System.out.println("\nRemove Last: " + myDoublyLL.removeLast());
        myDoublyLL.append(10);
        myDoublyLL.append(20);
        myDoublyLL.append(30);
        myDoublyLL.append(40);
        myDoublyLL.append(50);
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\nRemove Last: " + myDoublyLL.removeLast());
        System.out.println("Remove Last: " + myDoublyLL.removeLast());
        System.out.println();
        myDoublyLL.printList();

    }
}
