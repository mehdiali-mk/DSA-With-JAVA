public class _06_Binary_Tree_Height_Of_Tree {
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

    public static int findHeightOfTree(Node rootNode) {
        if (rootNode == null) {
            return 0;
        }

        int leftRootNode = findHeightOfTree(rootNode.leftNode);
        int rightRootNode = findHeightOfTree(rootNode.rightNode);

        return Math.max(leftRootNode, rightRootNode) + 1;
    }

    public static void main(String args[]) {
        int inOrder[] = { 4, 2, 5, 1, 3, 6 };
        int preOrder[] = { 1, 2, 4, 5, 3, 6 };

        int[] preOrderIndex = { 0 };
        Node rootNode = buildBinaryTree(preOrder, inOrder, preOrderIndex, 0, inOrder.length - 1);

        System.out.print("\n\n\nBinary Tree:\nHeight of Tree = " + findHeightOfTree(rootNode));
        System.out.println("\n\n\n");
    }
}
