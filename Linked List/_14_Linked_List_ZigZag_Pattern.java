import org.w3c.dom.Node;

public class _14_Linked_List_ZigZag_Pattern {
    public static class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
            this.nextNode = null;
        }
    }

    public static Node headNode;
    public static Node tailNode;
    public static int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            size++;
            return;
        }

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
            size++;
            return;
        }

        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void displayLinkedList() {
        Node tempNode = headNode;

        while (tempNode != null) {
            if (tempNode != headNode) {
                System.out.print(" -> ");
            }
            System.out.print(tempNode.data);
            tempNode = tempNode.nextNode;
        }
        System.out.println("\n");
    }

    public void addIndex(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node tempNode = headNode;
        size++;
        int i = 0;

        while (i < index - 1) {
            tempNode = tempNode.nextNode;
            i++;
        }

        newNode.nextNode = tempNode.nextNode;
        tempNode.nextNode = newNode;
    }

    public static int removeFirst() {
        if (size == 0) {
            System.out.println("\nLinked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return value;
        }

        int value = headNode.data;
        headNode = headNode.nextNode;
        size--;
        return value;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("\nLinked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = headNode.data;
            headNode = tailNode = null;
            size = 0;
            return value;
        }

        Node tempNode = headNode;

        for (int i = 0; i < size - 2; i++) {
            tempNode = tempNode.nextNode;
        }

        int value = tempNode.nextNode.data;
        tempNode.nextNode = null;
        tailNode = tempNode;
        size--;
        return value;
    }

    public static int iterativeSearch(int key) {
        Node tempNode = headNode;
        for (int i = 0; i < size - 1; i++) {
            if (tempNode.data == key) {
                return i;
            }
            tempNode = tempNode.nextNode;
        }
        return -1;
    }

    public static int recursiveHelper(Node newHeadNode, int key) {
        if (newHeadNode == null) {
            return -1;
        }

        if (newHeadNode.data == key) {
            return 0;
        }

        int index = recursiveHelper(newHeadNode.nextNode, key);

        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    public static int recursiveSearch(int key) {
        return recursiveHelper(headNode, key);
    }

    public static void reverseIterative() {
        Node previousNode = null;
        Node currentNode = tailNode = headNode;
        Node nextCurrentNode;

        while (currentNode != null) {
            nextCurrentNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextCurrentNode;
        }
        headNode = previousNode;
    }

    public static int removeNthFromEnd(int nthNode) {
        if (nthNode == size) {
            int value = headNode.data;
            headNode = headNode.nextNode;
            size--;
            return value;
        }

        Node currentNode = headNode;
        for (int i = 0; i < (size - nthNode) - 1; i++) {
            currentNode = currentNode.nextNode;
        }

        int value = currentNode.nextNode.data;
        currentNode.nextNode = currentNode.nextNode.nextNode;
        size--;
        return value;
    }

    public static Node findMiddleNode() {
        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;
        }
        return slowNode;
    }

    public static Boolean checkPalindrome() {
        if (headNode == null || headNode.nextNode == null) {
            return true;
        }
        Node middleNode = findMiddleNode();

        Node previousNode = null;
        Node currentNode = middleNode;
        Node nextCurrentNode;

        while (currentNode != null) {
            nextCurrentNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextCurrentNode;
        }

        Node rightNode = previousNode;
        Node leftNode = headNode;

        while (rightNode != null) {
            if (leftNode.data != rightNode.data) {
                return false;
            }
            leftNode = leftNode.nextNode;
            rightNode = rightNode.nextNode;
        }
        return true;
    }

    public static Boolean checkLoopExists() {
        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;

            if (slowNode == fastNode) {
                return true;
            }
        }

        return false;
    }

    public static void removeLoop() {
        Node slowNode = headNode;
        Node fastNode = headNode;
        Boolean cycle = false;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;

            if (slowNode == fastNode) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        slowNode = headNode;
        Node previousNode = null;
        while (slowNode != fastNode) {
            previousNode = fastNode;
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode;
        }

        previousNode.nextNode = null;
    }

    public static Node merge(Node firstHeadNode, Node secondHeadNode) {
        Node mergedLinkedList = new Node(-1);
        Node tempLinkedList = mergedLinkedList;

        while (firstHeadNode != null && secondHeadNode != null) {
            if (firstHeadNode.data <= secondHeadNode.data) {
                tempLinkedList.nextNode = firstHeadNode;
                firstHeadNode = firstHeadNode.nextNode;
                tempLinkedList = tempLinkedList.nextNode;
            } else {
                tempLinkedList.nextNode = secondHeadNode;
                secondHeadNode = secondHeadNode.nextNode;
                tempLinkedList = tempLinkedList.nextNode;
            }
        }

        while (firstHeadNode != null) {
            tempLinkedList.nextNode = firstHeadNode;
            firstHeadNode = firstHeadNode.nextNode;
            tempLinkedList = tempLinkedList.nextNode;
        }

        while (secondHeadNode != null) {
            tempLinkedList.nextNode = secondHeadNode;
            secondHeadNode = secondHeadNode.nextNode;
            tempLinkedList = tempLinkedList.nextNode;
        }

        return mergedLinkedList.nextNode;
    }

    public static Node getMiddleNode(Node head) {
        Node slowNode = head;
        Node fastNode = head.nextNode;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;
        }
        return slowNode;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.nextNode == null) {
            return head;
        }

        Node middleNode = getMiddleNode(head);
        Node rightHeadNode = middleNode.nextNode;
        middleNode.nextNode = null;

        Node newLeftNode = mergeSort(head);
        Node newRightNode = mergeSort(rightHeadNode);

        return merge(newLeftNode, newRightNode);
    }

    public static void zigZagPattern() {
        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;
        }

        Node middleNode = slowNode;

        Node currentNode = middleNode.nextNode;
        middleNode.nextNode = null;
        Node previousNode = null;
        Node nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.nextNode;
            currentNode.nextNode = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        Node leftHeadNode = headNode;
        Node rightHeadNode = previousNode;

        Node nextLeftNode;
        Node nextRightNode;

        while (leftHeadNode != null && rightHeadNode != null) {
            nextLeftNode = leftHeadNode.nextNode;
            leftHeadNode.nextNode = rightHeadNode;
            nextRightNode = rightHeadNode.nextNode;
            rightHeadNode.nextNode = nextLeftNode;

            leftHeadNode = nextLeftNode;
            rightHeadNode = nextRightNode;
        }
    }

    public static void main(String args[]) {
        _14_Linked_List_ZigZag_Pattern myLinkedList = new _14_Linked_List_ZigZag_Pattern();

        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);

        System.out.println("\n\nLinked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

        myLinkedList.zigZagPattern();
        System.out.println("\n\nZigZag Linked List of size (" + myLinkedList.size + "):");
        myLinkedList.displayLinkedList();

        System.out.println("\n");
    }
}
