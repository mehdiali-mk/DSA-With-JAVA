public class _16_Binary_Tree_Kth_Ancestor {

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

    public static int findKthAncestor(Node rootNode, int myValue, int kthAncestor) {
        if (rootNode == null) {
            return -1;
        }

        if (rootNode.data == myValue) {
            return 0;
        }

        int leftDistance = findKthAncestor(rootNode.leftNode, myValue, kthAncestor);
        int rightDistance = findKthAncestor(rootNode.rightNode, myValue, kthAncestor);

        if (leftDistance == -1 && rightDistance == -1) {
            return -1;
        }

        int maximumDistance = Math.max(leftDistance, rightDistance);
        if (maximumDistance + 1 == kthAncestor) {
            System.out.print(rootNode.data);
        }

        return maximumDistance + 1;
    }

    public static void main(String args[]) {
        Node rootNode = createBinaryTree();

        System.out.println("\n\n\nBinary Tree:\n");
        System.out.print("1st Ancestor of 5 = ");
        findKthAncestor(rootNode, 5, 1);
        System.out.print("\n2nd Ancestor of 5 = ");
        findKthAncestor(rootNode, 5, 2);
        System.out.print("\n1st Ancestor of 6 = ");
        findKthAncestor(rootNode, 6, 1);
        System.out.print("\n2nd Ancestor of 6 = ");
        findKthAncestor(rootNode, 6, 2);
        System.out.println("\n\n\n");
    }

}
