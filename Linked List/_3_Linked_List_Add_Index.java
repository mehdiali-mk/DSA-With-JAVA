public class _3_Linked_List_Add_Index {
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

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node tempNode = headNode;
        int i = 0;

        while (i < index - 1) {
            tempNode = tempNode.nextNode;
            i++;
        }

        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;
    }

    public static void main(String args[]) {
        _3_Linked_List_Add_Index myLinkedList = new _3_Linked_List_Add_Index();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        System.out.println("\n\nLinked List:");
        myLinkedList.displayLinkedList();

        myLinkedList.addIndex(2, 3);
        System.out.println("\n\nLinked List:");
        myLinkedList.displayLinkedList();
        System.out.println("\n");
    }
}
