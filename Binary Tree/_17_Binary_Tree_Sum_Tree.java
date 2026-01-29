public class _17_Binary_Tree_Sum_Tree {

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

    public static int transform(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }

        int leftChild = transform(rootNode.leftNode);
        int rightChild = transform(rootNode.rightNode);

        int data = rootNode.data;

        int newLeft = rootNode.leftNode == null ? 0 : rootNode.leftNode.data;
        int newRight = rootNode.rightNode == null ? 0 : rootNode.rightNode.data;

        rootNode.data = newLeft + leftChild + newRight + rightChild;

        return data;
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
        transform(rootNode);
        System.out.println("\n\n\nSum Binary Tree:");
        preOrder(rootNode);
        System.out.println("\n\n\n");
    }

}
