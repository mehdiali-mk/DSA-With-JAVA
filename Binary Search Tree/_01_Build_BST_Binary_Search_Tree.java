public class _01_Build_BST_Binary_Search_Tree {
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;

        Node(int data) {
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }

    public static Node insertNode(Node rootNode, int data) {
        if (rootNode == null) {
            rootNode = new Node(data);
            return rootNode;
        }

        if (rootNode.data > data) {
            rootNode.leftNode = insertNode(rootNode.leftNode, data);
        } else {
            rootNode.rightNode = insertNode(rootNode.rightNode, data);
        }

        return rootNode;
    }

    public static void InOrderTraversal(Node rootNode) {
        if (rootNode == null)
            return;

        InOrderTraversal(rootNode.leftNode);
        System.out.print(rootNode.data + " ");
        InOrderTraversal(rootNode.rightNode);
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node rootNode = null;

        for (int i = 0; i < values.length; i++) {
            rootNode = insertNode(rootNode, values[i]);
        }

        System.out.println("\n\n\nBinary Search Tree (InOrder):");
        InOrderTraversal(rootNode);
        System.out.println("\n\n\n");
    }
}
