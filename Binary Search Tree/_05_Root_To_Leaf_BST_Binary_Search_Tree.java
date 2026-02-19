import java.util.ArrayList;

public class _05_Root_To_Leaf_BST_Binary_Search_Tree {
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

    public static void printPath(ArrayList<Integer> paths) {
        for (int i = 0; i < paths.size(); i++) {
            System.out.print(paths.get(i) + " -> ");
        }
        System.out.println("null");
    }

    public static void printRootToLeafPaths(Node rootNode, ArrayList<Integer> paths) {
        if (rootNode == null) {
            return;
        }

        paths.add(rootNode.data);

        if (rootNode.leftNode == null && rootNode.rightNode == null) {
            printPath(paths);
        }

        if (rootNode.leftNode != null) {
            printRootToLeafPaths(rootNode.leftNode, paths);
        }

        if (rootNode.rightNode != null) {
            printRootToLeafPaths(rootNode.rightNode, paths);
        }

        paths.remove(paths.size() - 1);
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node rootNode = null;

        for (int i = 0; i < values.length; i++) {
            rootNode = insertNode(rootNode, values[i]);
        }

        System.out.println("\n\n\n\nBinary Search Tree (InOrder):");paths
        InOrderTraversal(rootNode, 1, 14);

        System.out.println("\n\nAll Paths from Root to Leaf Node:");
        printRootToLeafPaths(rootNode, new ArrayList<>());
        System.out.println("\n\n\n");
    }

}
