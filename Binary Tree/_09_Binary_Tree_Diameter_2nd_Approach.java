public class _09_Binary_Tree_Diameter_2nd_Approach {

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

    public static class Info {
        int diameter;
        int height;

        public Info(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info findHeightDiameterOfTree(Node rootNode) {
        if (rootNode == null) {
            return new Info(0, 0);
        }

        Info leftInfo = findHeightDiameterOfTree(rootNode.leftNode);
        Info rightInfo = findHeightDiameterOfTree(rootNode.rightNode);

        int diameter = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter),
                leftInfo.height + rightInfo.height + 1);
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter, height);
    }

    public static void main(String args[]) {
        int inOrder[] = { 4, 2, 5, 1, 3, 6 };
        int preOrder[] = { 1, 2, 4, 5, 3, 6 };

        int[] preOrderIndex = { 0 };
        Node rootNode = buildBinaryTree(preOrder, inOrder, preOrderIndex, 0, inOrder.length - 1);

        Info heightAndDiameter = findHeightDiameterOfTree(rootNode);

        System.out.print("\n\n\nBinary Tree:\nDiameter Of BinaryTree = " + heightAndDiameter.diameter
                + "\nHeight of Binary Tree = " + heightAndDiameter.height);
        System.out.println("\n\n\n");
    }
}
