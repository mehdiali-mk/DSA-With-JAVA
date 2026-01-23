public class _13_Binary_Tree_Kth_Level {

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

    public static void kthLevelTraverse(Node rooNode, int currentLevel, int kthLevel) {
        if (rooNode == null) {
            return;
        }

        if (currentLevel == kthLevel) {
            System.out.print(rooNode.data + " ");
        } else {
            kthLevelTraverse(rooNode.leftNode, currentLevel + 1, kthLevel);
            kthLevelTraverse(rooNode.rightNode, currentLevel + 1, kthLevel);
        }
    }

    public static void main(String args[]) {
        Node rootNode = createBinaryTree();

        System.out.print("\n\n\nBinary Tree:\nKth Level of Binary Tree = [ ");
        kthLevelTraverse(rootNode, 1, 3);
        System.out.println("]\n\n\n");
    }
}
