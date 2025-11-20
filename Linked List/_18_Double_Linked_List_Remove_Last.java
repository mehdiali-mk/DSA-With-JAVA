import org.w3c.dom.Node;

public class _16_Double_Linked_List_Remove_First {
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
        _16_Double_Linked_List_Remove_First doubleLinkedList = new _16_Double_Linked_List_Remove_First();

        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(1);
        System.out.println("\n\nDouble Linked List (" + doubleLinkedList.size + "):");
        doubleLinkedList.displayDoubleLinkedList();

        doubleLinkedList.removeLast();
        doubleLinkedList.removeLast();
        System.out.println("\n\nDouble Linked List (" + doubleLinkedList.size + "):");
        doubleLinkedList.displayDoubleLinkedList();
        System.out.println("\n\n");

    }
}