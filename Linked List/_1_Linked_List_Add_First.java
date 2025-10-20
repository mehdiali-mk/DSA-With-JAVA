public class _1_Linked_List_Class {
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
        _1_Linked_List_Class myLinkedList = new _1_Linked_List_Class();

        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(5);
        System.out.println("\n\nLinked List:");
        myLinkedList.displayLinkedList();
        System.out.println("\n");
    }
}
