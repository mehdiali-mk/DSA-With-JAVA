public class _18_Binary_Tree_isUnivalued {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        public Node(int data) {
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }

    public static Node createBinaryTree() {
        Node rootNode = new Node(1);

        rootNode.leftNode = new Node(2);
        rootNode.rightNode = new Node(3);

        rootNode.leftNode.leftNode = new Node(4);
        rootNode.leftNode.rightNode = new Node(5);
        rootNode.rightNode.leftNode = new Node(6);
        rootNode.rightNode.rightNode = new Node(7);

        return rootNode;
    }

    public static boolean isUnivaluedOrNot(Node rootNode) {
        if (rootNode == null) {
            return true;
        }

        if (rootNode.rightNode != null && rootNode.data != rootNode.rightNode.data) {
            return false;
        }

        if (rootNode.leftNode != null && rootNode.data != rootNode.leftNode.data) {
            return false;
        }

        return isUnivaluedOrNot(rootNode.leftNode) && isUnivaluedOrNot(rootNode.rightNode);
    }

    public static void preOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }

        System.out.print(rootNode.data + " ");
        preOrder(rootNode.leftNode);
        preOrder(rootNode.rightNode);
    }

    public static void main(String args[]) {
        Node rootNode = createBinaryTree();

        System.out.println("\n\n\nOriginal Binary Tree:");
        preOrder(rootNode);
        System.out.println("\nIs Univalued Or Not: " + isUnivaluedOrNot(rootNode));
        System.out.println("\n\n\n");
    }

}
