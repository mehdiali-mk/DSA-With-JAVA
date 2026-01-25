import java.util.ArrayList;

public class _14_Binary_Tree_Lowest_Common_Ancestor {

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

    public static boolean getPath(Node rootNode, int num, ArrayList<Node> path) {
        if (rootNode == null) {
            return false;
        }

        path.add(rootNode);

        if (rootNode.data == num) {
            return true;
        }

        boolean leftPath = getPath(rootNode.leftNode, num, path);
        boolean rightPath = getPath(rootNode.rightNode, num, path);

        if (leftPath || rightPath) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static int findLowestCommonAncestor(Node rootNode, int num1, int num2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(rootNode, num1, path1);
        getPath(rootNode, num2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1).data;
    }

    public static void main(String args[]) {
        Node rootNode = createBinaryTree();

        System.out.println("\n\n\nBinary Tree:\n");
        System.out.println("Ancestor of 4 & 5 = " + findLowestCommonAncestor(rootNode, 4, 5));
        System.out.println("Ancestor of 5 & 6 = " + findLowestCommonAncestor(rootNode, 5, 6));
        System.out.println("\n\n\n");
    }
}
