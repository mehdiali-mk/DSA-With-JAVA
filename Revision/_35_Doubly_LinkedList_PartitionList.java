public class _35_Doubly_LinkedList_PartitionList {
    public static void main(String args[]) {
        DoublyLinkedList myDoublyLL = new DoublyLinkedList(1);

        myDoublyLL.append(4);
        myDoublyLL.append(3);
        myDoublyLL.append(2);
        myDoublyLL.append(5);
        myDoublyLL.append(2);
        System.out.println("\n");
        myDoublyLL.printList();
        myDoublyLL = myDoublyLL.partitionList(3);
        System.out.println();
        myDoublyLL.printList();
        System.out.println("\n\n");
    }
}