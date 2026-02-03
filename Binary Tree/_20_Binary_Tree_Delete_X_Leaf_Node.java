public class _20_Binary_Tree_Delete_X_Leaf_Node {
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

        rootNode.leftNode = new Node(3);
        rootNode.rightNode = new Node(3);

        rootNode.leftNode.leftNode = new Node(3);
        rootNode.leftNode.rightNode = new Node(4);
        // rootNode.rightNode.leftNode = new Node(6);
        // rootNode.rightNode.rightNode = new Node(7);

        return rootNode;
    }

    public static Node deleteXLeafNode(Node rootNode, int number) {
        if (rootNode == null) {
            return rootNode;
        }

        rootNode.leftNode = deleteXLeafNode(rootNode.leftNode, number);
        rootNode.rightNode = deleteXLeafNode(rootNode.rightNode, number);

        if (rootNode.data == number && rootNode.leftNode == null && rootNode.rightNode == null)
            return null;

        return rootNode;
    }

    public static void preOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }

        System.out.print(rootNode.data + " ");
        preOrder(rootNode.leftNode);
        preOrder(rootNode.rightNode);
    }

    public static void main(String[] args) {
        Node rootNode = createBinaryTree();

        System.out.println("\n\n\nOriginal Binary Tree:");
        preOrder(rootNode);
        rootNode = deleteXLeafNode(rootNode, 3);
        System.out.println("\n\nLeaf Node with value 3 deleted\n\nAfter Deletion Binary Tree:");
        preOrder(rootNode);
        System.out.println("\n\n\n");
    }

}
