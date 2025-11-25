import org.w3c.dom.Node;

public class _25_Circular_Linked_List_Reverse {
    public static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public static Node headNode;
    public static Node tailNode;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            size++;
            return;
        }

        newNode.nextNode = headNode;
        headNode = newNode;
        tailNode.nextNode = headNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (tailNode == null) {
            headNode = tailNode = newNode;
            size++;
            return;
        }

        newNode.nextNode = headNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("\nCircular Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return value;
        }

        int value = headNode.data;
        tailNode.nextNode = headNode.nextNode;
        headNode = headNode.nextNode;
        size--;
        return value;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("\nLinked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return value;
        }

        Node tempNode = headNode;

        for (int i = 0; i < size - 2; i++) {
            tempNode = tempNode.nextNode;
        }

        int value = tempNode.nextNode.data;
        tempNode.nextNode = headNode;
        tailNode.nextNode = null;
        tailNode = tempNode;
        size--;

        return value;
    }

    public void reverseCircularLinkedList() {
        Node currentNode = headNode;
        Node previousNode = tailNode;
        Node nextNode = null;
        Node tempNode = tailNode;

        while (currentNode != tailNode) {
            tailNode = headNode;
            nextNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        headNode = previousNode;
    }

    public void displayLinkedList() {
        Node tempNode = headNode;

        do {
            if (tempNode != headNode) {
                System.out.print(" -> ");
            }
            System.out.print(tempNode.data);
            tempNode = tempNode.nextNode;
        } while (tempNode.nextNode != headNode.nextNode);
        System.out.print(" -> ");
        System.out.println("\n");
    }

    public static void main(String args[]) {
        _25_Circular_Linked_List_Reverse myLinkedList = new _25_Circular_Linked_List_Reverse();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        System.out.println("\n\nCircular Linked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

        myLinkedList.reverseCircularLinkedList();
        System.out.println("\n\nCircular Linked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

    }
}
