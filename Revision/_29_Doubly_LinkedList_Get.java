public class _29_Doubly_LinkedList_Get {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(10);

        myDoublyLL.append(20);
        myDoublyLL.append(30);
        myDoublyLL.append(40);
        myDoublyLL.append(50);
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\nGet 2: " + myDoublyLL.getValue(2));
        System.out.println("Get 3: " + myDoublyLL.getValue(3));
        System.out.println("Get 0: " + myDoublyLL.getValue(0));
        System.out.println("\n\n");
    }
}
