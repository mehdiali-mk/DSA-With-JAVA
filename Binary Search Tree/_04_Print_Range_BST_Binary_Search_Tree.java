public class _04_Print_Range_BST_Binary_Search_Tree {
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

    public static void InOrderTraversal(Node rootNode, int lowerLimit, int upperLimit) {
        if (rootNode == null)
            return;

        InOrderTraversal(rootNode.leftNode, lowerLimit, upperLimit);
        if (rootNode.data >= lowerLimit && rootNode.data <= upperLimit) {
            System.out.print(rootNode.data + " ");
        }
        InOrderTraversal(rootNode.rightNode, lowerLimit, upperLimit);
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node rootNode = null;

        for (int i = 0; i < values.length; i++) {
            rootNode = insertNode(rootNode, values[i]);
        }

        System.out.println("\n\n\n\nBinary Search Tree (InOrder):");
        InOrderTraversal(rootNode, 1, 14);
        System.out.println("\n\n\nPrint Node between 5 to 12:");
        InOrderTraversal(rootNode, 5, 12);
        System.out.println("\n\n\n");
    }

}
