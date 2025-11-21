import org.w3c.dom.Node;

public class _21_Circular_Linked_List_Add_First {
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
        _21_Circular_Linked_List_Add_First myLinkedList = new _21_Circular_Linked_List_Add_First();

        myLinkedList.addFirst(5);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        System.out.println("\n\nCircular Linked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();
        System.out.println("\n\n");

    }
}
