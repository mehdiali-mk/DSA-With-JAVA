public class _73_BubbleSort_LinkedList {
    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.appendNode(2);
        myLinkedList.appendNode(6);
        myLinkedList.appendNode(5);
        myLinkedList.appendNode(1);
        myLinkedList.appendNode(3);

        System.out.println("\n\n");

        myLinkedList.printList();

        bubbleSort(myLinkedList);

        System.out.println("\nAfter Bubble Sort:");
        myLinkedList.printList();

        System.out.println("\n\n");
    }

    public static void bubbleSort(LinkedList myLinkedList) {
        for (int i = myLinkedList.getLengthValue() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myLinkedList.get(j) > myLinkedList.get(j + 1)) {
                    int tempValue = myLinkedList.get(j);
                    myLinkedList.set(j, myLinkedList.get(j + 1));
                    myLinkedList.set(j + 1, tempValue);
                }
            }
        }
    }
}