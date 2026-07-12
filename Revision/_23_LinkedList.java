public class _23_LinkedList {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(10);

        myLinkedList.removeLast();
        myLinkedList.printList();

        myLinkedList.appendNode(1);
        myLinkedList.appendNode(1);
        myLinkedList.appendNode(1);
        System.out.println("\n");
        myLinkedList.printList();

        System.out.println("Binary To Decimal = " + myLinkedList.convertBinaryToDecimal());
        myLinkedList.printList();
        System.out.println("\n");

    }
}
