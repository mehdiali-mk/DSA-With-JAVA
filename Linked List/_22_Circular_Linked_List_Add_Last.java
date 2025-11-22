import org.w3c.dom.Node;

public class _22_Circular_Linked_List_Add_Last {
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
        _22_Circular_Linked_List_Add_Last myLinkedList = new _22_Circular_Linked_List_Add_Last();

        myLinkedList.addLast(5);
        myLinkedList.addLast(4);
        myLinkedList.addLast(3);
        myLinkedList.addLast(2);
        myLinkedList.addLast(1);
        System.out.println("\n\nCircular Linked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

    }
}
