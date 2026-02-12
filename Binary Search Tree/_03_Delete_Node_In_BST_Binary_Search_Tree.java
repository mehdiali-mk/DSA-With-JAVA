public class _03_Delete_Node_In_BST_Binary_Search_Tree {
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

    public static boolean searchInBST(Node rootNode, int number) {
        if (rootNode == null) {
            return false;
        }

        if (rootNode.data > number) {
            searchInBST(rootNode.leftNode, number);
        } else if (rootNode.data < number) {
            searchInBST(rootNode.rightNode, number);
        }

        return true;
    }

    public static Node deleteNode(Node rootNode, int number) {
        if (rootNode.data < number) {
            rootNode.rightNode = deleteNode(rootNode.rightNode, number);
        } else if (rootNode.data > number) {
            rootNode.leftNode = deleteNode(rootNode.leftNode, number);
        } else {
            if (rootNode.leftNode == null && rootNode.rightNode == null) {
                return null;
            }

            if (rootNode.leftNode == null) {
                return rootNode.rightNode;
            } else if (rootNode.rightNode == null) {
                return rootNode.leftNode;
            }

            Node inOrderSuccessor = findInOrderSuccessor(rootNode.rightNode);
            rootNode.data = inOrderSuccessor.data;
            rootNode.rightNode = deleteNode(rootNode.rightNode, inOrderSuccessor.data);
        }

        return rootNode;
    }

    public static Node findInOrderSuccessor(Node rootNode) {
        while (rootNode.leftNode != null) {
            rootNode = rootNode.leftNode;
        }
        return rootNode;
    }

    public static void main(String args[]) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node rootNode = null;

        for (int i = 0; i < values.length; i++) {
            rootNode = insertNode(rootNode, values[i]);
        }

        System.out.println("\n\n\n\nBinary Search Tree (InOrder):");
        InOrderTraversal(rootNode);
        System.out.println("\n\nDelete Node 1:");
        deleteNode(rootNode, 1);
        InOrderTraversal(rootNode);
        System.out.println("\n\nDelete Node 8:");
        deleteNode(rootNode, 8);
        InOrderTraversal(rootNode);
        System.out.println("\n\nDelete Node 5:");
        deleteNode(rootNode, 5);
        InOrderTraversal(rootNode);
        System.out.println("\n\n\n\n");
    }

}
