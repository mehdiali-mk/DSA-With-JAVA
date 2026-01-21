import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.sound.sampled.DataLine.Info;

public class _12_Binary_Tree_Bottom_View_Of_Tree {
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

        rootNode.leftNode.rightNode = new Node(4);
        rootNode.leftNode.rightNode.rightNode = new Node(5);
        rootNode.leftNode.rightNode.rightNode.rightNode = new Node(6);

        return rootNode;
    }

    static class Info {
        Node myNode;
        int horizontalWidth;

        public Info(Node myNode, int horizontalWidth) {
            this.myNode = myNode;
            this.horizontalWidth = horizontalWidth;
        }
    }

    public static void topViewOfBinaryTree(Node rootNode) {

        if (rootNode == null) {
            return;
        }

        HashMap<Integer, Node> myHashMap = new HashMap<>();

        // Level Order Traversal
        Queue<Info> myQueue = new LinkedList<>();
        myQueue.add(new Info(rootNode, 0));
        myQueue.add(null);

        int minimumValue = 0, maximumValue = 0;

        while (!myQueue.isEmpty()) {
            Info currentInfo = myQueue.remove();
            if (currentInfo == null) {
                if (myQueue.isEmpty()) {
                    break;
                } else {
                    myQueue.add(null);
                }
            }

            else {
                myHashMap.put(currentInfo.horizontalWidth, currentInfo.myNode);

                if (currentInfo.myNode.leftNode != null) {
                    myQueue.add(new Info(currentInfo.myNode.leftNode, currentInfo.horizontalWidth - 1));
                    minimumValue = Math.min(minimumValue, currentInfo.horizontalWidth - 1);
                }
                if (currentInfo.myNode.rightNode != null) {
                    myQueue.add(new Info(currentInfo.myNode.rightNode, currentInfo.horizontalWidth + 1));
                    maximumValue = Math.max(maximumValue, currentInfo.horizontalWidth + 1);
                }
            }

        }

        for (int i = minimumValue; i <= maximumValue; i++) {
            System.out.print(myHashMap.get(i).data + " ");
        }

    }

    public static void main(String args[]) {
        Node rootNode = createBinaryTree();

        System.out.print("\n\n\nBinary Tree:\nTop View of Binary Tree = [ ");
        topViewOfBinaryTree(rootNode);
        System.out.println("]\n\n\n");
    }
}
