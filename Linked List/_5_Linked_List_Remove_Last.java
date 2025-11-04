import org.w3c.dom.Node;

public class _5_Linked_List_Remove_Last {
    public static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            size++;
            return;
        }

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            size++;
            return;
        }

        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void displayLinkedList() {
        Node tempNode = headNode;

        while (tempNode != null) {
            if (tempNode != headNode) {
                System.out.print(" -> ");
            }
            System.out.print(tempNode.data);
            tempNode = tempNode.nextNode;
        }
        System.out.println("\n");
    }

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node tempNode = headNode;
        size++;
        int i = 0;

        while (i < index - 1) {
            tempNode = tempNode.nextNode;
            i++;
        }

        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;
    }

    public static int removeFirst() {
        if (size == 0) {
            System.out.println("\nLinked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return value;
        }

        int value = headNode.data;
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
        tempNode.nextNode = null;
        tailNode = tempNode;
        size--;
        return value;
    }

    public static Node headNode;
    public static Node tailNode;
    public static int size = 0;

    public static void main(String args[]) {
        _5_Linked_List_Remove_Last myLinkedList = new _5_Linked_List_Remove_Last();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        System.out.println("\n\nLinked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

        myLinkedList.removeLast();
        myLinkedList.removeLast();

        System.out.println("\n\nLinked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

        System.out.println("\n");
    }
}
