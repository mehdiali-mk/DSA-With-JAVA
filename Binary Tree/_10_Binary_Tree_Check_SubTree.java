public class _10_Binary_Tree_Check_SubTree {

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

    public static Node buildBinaryTree(int preOrder[], int inOrder[], int[] preOrderIndex, int leftBound,
            int rightBound) {

        if (leftBound > rightBound) {
            return null;
        }

        Node root = new Node(preOrder[preOrderIndex[0]]);
        preOrderIndex[0]++;

        int inOrderIndex = searchNodeInOrder(inOrder, preOrder[preOrderIndex[0] - 1], leftBound, rightBound);

        root.leftNode = buildBinaryTree(preOrder, inOrder, preOrderIndex, leftBound, inOrderIndex - 1);
        root.rightNode = buildBinaryTree(preOrder, inOrder, preOrderIndex, inOrderIndex + 1, rightBound);

        return root;
    }

    public static int searchNodeInOrder(int inOrder[], int preOrderItem, int leftBound, int rightBound) {
        for (int i = leftBound; i <= rightBound; i++) {
            if (inOrder[i] == preOrderItem) {
                return i;
            }
        }

        return -1;
    }

    public static boolean isIdentical(Node rootNode, Node subRootNode) {
        if (rootNode == null && subRootNode == null) {
            return true;
        } else if (rootNode == null || subRootNode == null || rootNode.data != subRootNode.data) {
            return false;
        }

        if (!isIdentical(rootNode.leftNode, subRootNode.leftNode)) {
            return false;
        }
        if (!isIdentical(rootNode.rightNode, subRootNode.rightNode)) {
            return false;
        }

        return true;
    }

    public static boolean checkSubTree(Node rootNode, Node subRootNode) {
        if (rootNode == null) {
            return false;
        }

        if (rootNode.data == subRootNode.data) {
            if (isIdentical(rootNode, subRootNode)) {
                return true;
            }
        }

        return checkSubTree(rootNode.leftNode, subRootNode) || checkSubTree(rootNode.rightNode, subRootNode);
    }

    public static void main(String args[]) {
        int inOrder[] = { 4, 2, 5, 1, 3, 6 };
        int preOrder[] = { 1, 2, 4, 5, 3, 6 };
        int subInOrder[] = { 4, 2, 5 };
        int subPreOrder[] = { 2, 4, 5 };

        int[] preOrderIndex = { 0 };
        Node rootNode = buildBinaryTree(preOrder, inOrder, preOrderIndex, 0, inOrder.length - 1);

        int[] subPreOrderIndex = { 0 };
        Node subRootNode = buildBinaryTree(subPreOrder, subInOrder, subPreOrderIndex, 0, subInOrder.length - 1);

        System.out.print("\n\n\nBinary Tree:\nCheck SubTree in Binary Tree = " + checkSubTree(rootNode, subRootNode));
        System.out.println("\n\n\n");
    }
}
