import org.w3c.dom.Node;

public class _20_Double_Linked_List_Reverse {
    public class Node {
        int data;
        Node nextNode;
        Node previousNode;

        public Node(int data) {
            this.data = data;
            nextNode = null;
            previousNode = null;
        }
    }

    public static Node headNode;
    public static Node tailNode;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (headNode == null) {
            headNode = tailNode = newNode;
            return;
        }

        newNode.previousNode = null;
        newNode.nextNode = headNode;
        headNode.previousNode = newNode;
        headNode = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tailNode == null) {
            headNode = tailNode = newNode;
            return;
        }

        tailNode.nextNode = newNode;
        newNode.previousNode = tailNode;
        tailNode = newNode;
    }

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node temp = headNode;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.nextNode;
            }
            Node newNode = new Node(data);
            newNode.nextNode = temp.nextNode;
            newNode.previousNode = temp;
            temp.nextNode.previousNode = newNode;
            temp.nextNode = newNode;
            size++;
        }
    }

    public int removeFirst() {
        if (headNode == null) {
            System.out.println("Double Linked List is empty.");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size--;
            return value;
        }

        int value = headNode.data;
        headNode = headNode.nextNode;
        headNode.previousNode = null;
        size--;
        return value;
    }

    public int removeLast() {
        if (tailNode == null) {
            System.out.println("Double Linked List is empty.");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size--;
            return value;
        }

        int value = tailNode.data;
        tailNode = tailNode.previousNode;
        tailNode.nextNode = null;
        size--;
        return value;
    }

    public void reverseDoubleLinkedList() {
        Node currentNode = headNode;
        Node previousNode = null;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            currentNode.previousNode = nextNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        headNode = previousNode;
    }

    public void displayDoubleLinkedList() {
        Node tempNode = headNode;

        while (tempNode != null) {
            if (tempNode != headNode) {
                System.out.print(" <-> ");
            }
            System.out.print(tempNode.data);
            tempNode = tempNode.nextNode;
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        _20_Double_Linked_List_Reverse doubleLinkedList = new _20_Double_Linked_List_Reverse();

        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(1);
        System.out.println("\n\nDouble Linked List (" + doubleLinkedList.size + "):");
        doubleLinkedList.displayDoubleLinkedList();

        doubleLinkedList.reverseDoubleLinkedList();
        System.out.println("\n\nDouble Linked List (" + doubleLinkedList.size + "):");
        doubleLinkedList.displayDoubleLinkedList();
    }
}