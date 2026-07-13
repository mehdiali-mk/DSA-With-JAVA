public class _23_LinkedList {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(10);

        myLinkedList.removeLast();
        myLinkedList.printList();

        myLinkedList.appendNode(1);
        myLinkedList.appendNode(2);
        myLinkedList.appendNode(3);
        myLinkedList.appendNode(4);
        myLinkedList.appendNode(5);
        System.out.println("\n");
        myLinkedList.printList();

        myLinkedList.reverseBetween(2, 4);
        myLinkedList.printList();
        System.out.println("\n");

    }
}
