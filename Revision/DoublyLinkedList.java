public class DoublyLinkedList {

    class Node {
        int value;
        Node nextNode;
        Node previousNode;

        Node(int value) {
            this.value = value;
            nextNode = null;
            previousNode = null;
        }
    }

    private Node headNode;
    private Node tailNode;
    private int length = 0;

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        headNode = tailNode = newNode;
        length = 1;
    }

    public void printList() {
        if (length == 0)
            return;
        Node tempNode = headNode;
        System.out.print("\nDoubly Linked List: ");
        for (int i = 0; i < length; i++) {
            System.out.print(tempNode.value);
            if (i != length - 1)
                System.out.print(" <-> ");
            tempNode = tempNode.nextNode;
        }
    }

    public int getHeadNodeValue() {
        if (length == 0)
            return -1;
        return headNode.value;
    }

    public int getTailNodeValue() {
        if (length == 0)
            return -1;
        return tailNode.value;
    }

    public Node getHeadNode() {
        if (length == 0)
            return null;
        return headNode;
    }

    public Node getTailNode() {
        if (length == 0)
            return null;
        return tailNode;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            headNode = tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
            newNode.previousNode = tailNode;
            tailNode = newNode;
        }
        length++;
    }

    public int removeLast() {
        if (length == 0) {
            System.out.println("Create Doubly Linked List");
            return -1;
        }
        Node tempNode = tailNode;
        if (length == 1) {
            headNode = tailNode = null;
        } else {
            tailNode = tailNode.previousNode;
            tailNode.nextNode = null;
            tempNode.previousNode = null;
        }
        length--;
        return tempNode.value;
    }

    public void prepend(int value) {
        Node tempNode = new Node(value);
        if (length == 0) {
            headNode = tailNode = tempNode;
        } else {
            tempNode.nextNode = headNode;
            headNode.previousNode = tempNode;
            headNode = tempNode;
        }
        length++;
    }

    public int removeFirst() {
        if (length == 0) {
            System.out.println("Create Doubly Linked List");
            return -1;
        }
        Node tempNode = headNode;
        if (length == 1) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.nextNode;
            headNode.previousNode = null;
            tempNode.nextNode = null;
        }
        length--;
        return tempNode.value;
    }
}
