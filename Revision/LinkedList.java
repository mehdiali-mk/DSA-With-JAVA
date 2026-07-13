public class LinkedList {

    class Node {
        int value;
        Node nextNode;

        public Node(int value) {
            this.value = value;
            this.nextNode = null;
        }
    }

    private Node headNode = null;
    private Node tailNode = null;
    private int length = 0;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        headNode = tailNode = newNode;
        length++;
    }

    public LinkedList() {
    }

    public void printList() {
        Node tempNode = headNode;
        System.out.print("\nLinked List: ");
        if (headNode == null && tailNode == null) {
            System.out.print(" Empty ");
        } else {
            while (tempNode != null) {
                System.out.print(tempNode.value);
                tempNode = tempNode.nextNode;
                if (tempNode != null) {
                    System.out.print(" -> ");
                }
            }
        }
        System.out.println();
    }

    public void getHeadNode() {
        System.out.println("Head Node: " + (headNode != null ? headNode.value : "null."));
    }

    public void getTailNode() {
        System.out.println("Tail Node: " + (tailNode != null ? tailNode.value : "null."));
    }

    public void getLength() {
        System.out.println("LL Length: " + length);
    }

    public void appendNode(int value) {
        Node newNode = new Node(value);
        if (headNode == null && tailNode == null) {
            headNode = tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
        }
        length++;
    }

    public int removeLast() {
        if (length == 0) {
            System.out.println("\nLL is already empty.");
            return -1;
        }
        Node tempNode = headNode;
        if (length == 1) {
            headNode = tailNode = null;
        } else {
            Node preNode = tempNode;
            while (tempNode.nextNode != null) {
                preNode = tempNode;
                tempNode = tempNode.nextNode;
            }
            tailNode = preNode;
            tailNode.nextNode = null;
        }
        length--;
        return tempNode.value;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (headNode == null && tailNode == null)
            headNode = tailNode = newNode;
        else {
            newNode.nextNode = headNode;
            headNode = newNode;
        }
        length++;
    }

    public int removeFirst() {
        if (length == 0) {
            System.out.println("\nLL is already empty.");
            return -1;
        } else {
            Node tempNode = headNode;
            if (length == 1) {
                headNode = tailNode = null;
            } else {
                headNode = headNode.nextNode;
            }
            tempNode.nextNode = null;
            length--;
            return tempNode.value;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= length)
            return -1;
        Node tempNode = headNode;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.nextNode;
        }
        return tempNode.value;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= length)
            return false;
        Node tempNode = headNode;
        for (int i = 0; i < index; i++)
            tempNode = tempNode.nextNode;
        tempNode.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;
        if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length) {
            appendNode(value);
            return true;
        } else {
            Node newNode = new Node(value);
            Node tempNode = headNode;
            for (int i = 0; i < index - 1; i++)
                tempNode = tempNode.nextNode;
            newNode.nextNode = tempNode.nextNode;
            tempNode.nextNode = newNode;
        }
        length++;
        return true;
    }

    public int remove(int index) {
        if (index < 0 || index >= length) {
            System.out.println("\nEnter correct index!");
            return -1;
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        } else {
            Node preNode = headNode;
            for (int i = 0; i < index - 1; i++) {
                preNode = preNode.nextNode;
            }
            Node tempNode = preNode.nextNode;
            preNode.nextNode = tempNode.nextNode;
            tempNode.nextNode = null;
            length--;
            return tempNode.value;
        }
    }

    public void reverse() {
        Node tempNode = headNode;
        headNode = tailNode;
        tailNode = tempNode;
        Node afterNode = tempNode.nextNode;
        Node beforeNode = null;

        for (int i = 0; i < length; i++) {
            System.out.println(tempNode.value);
            afterNode = tempNode.nextNode;
            tempNode.nextNode = beforeNode;
            beforeNode = tempNode;
            tempNode = afterNode;
        }
    }

    public int findMiddle() {
        if (length == 0) {
            System.out.println("\nCreate Linked List!");
            return -1;
        }
        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null && fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;
        }
        return slowNode.value;
    }

    public boolean hasLoop() {
        if (length == 0) {
            System.out.println("\nCreate Linked List!");
            return false;
        }
        tailNode.nextNode = headNode.nextNode.nextNode;
        Node slowNode = headNode;
        Node fastNode = headNode;

        while (fastNode != null || fastNode.nextNode != null) {
            slowNode = slowNode.nextNode;
            fastNode = fastNode.nextNode.nextNode;
            if (slowNode == fastNode)
                return true;
        }

        return false;
    }

    public int kthFromEnd(int kthNode) {
        if (kthNode <= 0 || kthNode > length) {
            System.out.println("\nEnter correct index!");
            return -1;
        }
        return get(length - kthNode);
    }

    public LinkedList partitionLinkedList(int partitionValue) {
        if (length == 0)
            return new LinkedList();
        LinkedList smallValuedLL = new LinkedList();
        LinkedList bigValuedLL = new LinkedList();

        Node tempNode = headNode;
        for (int i = 0; i < length; i++) {
            if (tempNode.value < partitionValue) {
                smallValuedLL.appendNode(tempNode.value);
            } else {
                bigValuedLL.appendNode(tempNode.value);
            }
            tempNode = tempNode.nextNode;
        }
        tempNode = bigValuedLL.headNode;
        for (int i = 0; i < bigValuedLL.length; i++) {
            smallValuedLL.appendNode(tempNode.value);
            tempNode = tempNode.nextNode;
        }
        return smallValuedLL;
    }

    public int convertBinaryToDecimal() {
        if (length == 0) {
            System.out.println("\nCreate Linked List!");
            return -1;
        }
        int total = 0;
        Node tempNode = headNode;
        for (int i = 0; i < length; i++) {
            // System.out.println(total + " // " + tempNode.value);
            total *= 2;
            total += tempNode.value;
            tempNode = tempNode.nextNode;
        }
        return total;
    }

    public void reverseBetween(int startingPosition, int endingPosition) {
        if (startingPosition < 0 || startingPosition > length || endingPosition < 0 || endingPosition > length
                || startingPosition > endingPosition || startingPosition == endingPosition)
            return;

        Node startNode = headNode;
        Node beforeStartNode = headNode;
        for (int i = 1; i < startingPosition; i++) {
            if (i < startingPosition - 1) {
                beforeStartNode = beforeStartNode.nextNode;
            }
            startNode = startNode.nextNode;
        }
        Node endNode = startNode;
        for (int i = 1; i < endingPosition - 1; i++) {
            endNode = endNode.nextNode;
        }

        Node currentNode = startNode.nextNode;
        Node afterNode = currentNode.nextNode;
        Node beforeNode = startNode;

        for (int i = startingPosition; i < endingPosition; i++) {

            afterNode = currentNode.nextNode;
            currentNode.nextNode = beforeNode;
            beforeNode = currentNode;
            currentNode = afterNode;

        }
        beforeStartNode.nextNode = beforeNode;
        startNode.nextNode = currentNode;
    }

}