import org.w3c.dom.Node;

public class _15_Double_Linked_List_Add_First {
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
    public static Node size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = tailNode = newNode;
            return;
        }

        newNode.previousNode = null;
        newNode.nextNode = headNode;
        headNode.previousNode = newNode;
        headNode = newNode;
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
        _15_Double_Linked_List_Add_First doubleLinkedList = new _15_Double_Linked_List_Add_First();

        doubleLinkedList.addFirst(5);
        doubleLinkedList.addFirst(4);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(1);
        System.out.println("\n\nDouble Linked List (" + doubleLinkedList.size + "):");
        doubleLinkedList.displayDoubleLinkedList();
        System.out.println("\n\n");

    }
}