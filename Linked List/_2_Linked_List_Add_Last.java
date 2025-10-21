public class _2_Linked_List_Add_Last {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            return;
        }

        newNode.nextNode = headNode;
        headNode = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            return;
        }

        tailNode.nextNode = newNode;
        tailNode = newNode;
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

    public static void main(String args[]) {
        _2_Linked_List_Add_Last myLinkedList = new _2_Linked_List_Add_Last();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        System.out.println("\n\nLinked List:");
        myLinkedList.displayLinkedList();
        System.out.println("\n");
    }
}
