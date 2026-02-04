import java.util.HashMap;

public class _21_Binary_Tree_Print_Duplicate_SubTree {
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

        rootNode.leftNode = new Node(3);
        rootNode.rightNode = new Node(3);

        rootNode.leftNode.leftNode = new Node(4);
        rootNode.leftNode.rightNode = new Node(4);

        rootNode.rightNode.leftNode = new Node(4);
        rootNode.rightNode.rightNode = new Node(4);

        // rootNode.rightNode.leftNode = new Node(6);
        // rootNode.rightNode.rightNode = new Node(7);

        return rootNode;
    }

    public static Node deleteXLeafNode(Node rootNode, int number) {
        if (rootNode == null) {
            return rootNode;
        }

        rootNode.leftNode = deleteXLeafNode(rootNode.leftNode, number);
        rootNode.rightNode = deleteXLeafNode(rootNode.rightNode, number);

        if (rootNode.data == number && rootNode.leftNode == null && rootNode.rightNode == null)
            return null;

        return rootNode;
    }

    static HashMap<String, Integer> myHashMap;

    public static String inOrderSubTree(Node rootNode) {
        if (rootNode == null) {
            return "null";
        }

        String str = "(";
        str += inOrderSubTree(rootNode.leftNode);
        str += Integer.toString(rootNode.data);
        str += inOrderSubTree(rootNode.rightNode);
        str += ")";

        if (myHashMap.containsKey(str)) {
            myHashMap.put(str, myHashMap.get(str) + 1);
        } else {
            myHashMap.put(str, 1);
        }

        return str;
    }

    public static void printAllDuplicateSubTree(Node rootNode) {
        myHashMap = new HashMap<>();
        inOrderSubTree(rootNode);

        for (String key : myHashMap.keySet()) {
            if (myHashMap.get(key) > 1) {

                String value = key.substring(1, key.length() - 1);
                String[] parts = value.split("[()]+");
                for (String part : parts) {
                    if (!part.isEmpty() && !part.equals("null")) {
                        try {
                            System.out.print(Integer.parseInt(part) + " ");
                            break;
                        } catch (NumberFormatException e) {
                        }
                    }
                }
            }
        }
    }

    public static void preOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }

        System.out.print(rootNode.data + " ");
        preOrder(rootNode.leftNode);
        preOrder(rootNode.rightNode);
    }

    public static void main(String[] args) {
        Node rootNode = createBinaryTree();

        System.out.println("\n\n\nOriginal Binary Tree:");
        preOrder(rootNode);
        System.out.println("\n\n\nDuplicate SubTree:");
        printAllDuplicateSubTree(rootNode);
        System.out.println("\n\n\n");
    }

}
