public class DoublyLinkedList {

    class Node {
        int value;
        Node nextNode;
        Node previousNode;

        Node(int value) {
            this.value = value;
            nextNode = null;
            previousNode = null;
        }
    }

    private Node headNode;
    private Node tailNode;
    private int length = 0;

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        headNode = tailNode = newNode;
        length = 1;
    }

    DoublyLinkedList() {
    }

    public void printList() {
        if (length == 0)
            return;
        Node tempNode = headNode;
        System.out.print("\nDoubly Linked List: ");
        for (int i = 0; i < length; i++) {
            System.out.print(tempNode.value);
            if (i != length - 1)
                System.out.print(" <-> ");
            tempNode = tempNode.nextNode;
        }
    }

    public int getHeadNodeValue() {
        if (length == 0)
            return -1;
        return headNode.value;
    }

    public int getTailNodeValue() {
        if (length == 0)
            return -1;
        return tailNode.value;
    }

    public Node getHeadNode() {
        if (length == 0)
            return null;
        return headNode;
    }

    public Node getTailNode() {
        if (length == 0)
            return null;
        return tailNode;
    }

    public int getLength() {
        return length;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            headNode = tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
            newNode.previousNode = tailNode;
            tailNode = newNode;
        }
        length++;
    }

    public int removeLast() {
        if (length == 0) {
            System.out.println("Create Doubly Linked List");
            return -1;
        }
        Node tempNode = tailNode;
        if (length == 1) {
            headNode = tailNode = null;
        } else {
            tailNode = tailNode.previousNode;
            tailNode.nextNode = null;
            tempNode.previousNode = null;
        }
        length--;
        return tempNode.value;
    }

    public void prepend(int value) {
        Node tempNode = new Node(value);
        if (length == 0) {
            headNode = tailNode = tempNode;
        } else {
            tempNode.nextNode = headNode;
            headNode.previousNode = tempNode;
            headNode = tempNode;
        }
        length++;
    }

    public int removeFirst() {
        if (length == 0) {
            System.out.println("Create Doubly Linked List");
            return -1;
        }
        Node tempNode = headNode;
        if (length == 1) {
            headNode = tailNode = null;
        } else {
            headNode = headNode.nextNode;
            headNode.previousNode = null;
            tempNode.nextNode = null;
        }
        length--;
        return tempNode.value;
    }

    public int getValue(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Enter Correct Index");
            return -1;
        }
        Node tempNode = headNode;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.nextNode;
            }
        } else {
            tempNode = tailNode;
            for (int i = length - 1; i > index; i--) {
                tempNode = tempNode.previousNode;
            }
        }
        return tempNode.value;
    }

    public Node getNode(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node tempNode = headNode;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                tempNode = tempNode.nextNode;
            }
        } else {
            tempNode = tailNode;
            for (int i = length - 1; i > index; i--) {
                tempNode = tempNode.previousNode;
            }
        }
        return tempNode;
    }

    public boolean set(int index, int value) {
        Node tempNode = getNode(index);
        if (tempNode != null) {
            tempNode.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            System.out.println("Enter Correct Index");
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node beforeNode = getNode(index - 1);
        Node afterNode = beforeNode.nextNode;

        newNode.previousNode = beforeNode;
        newNode.nextNode = afterNode;
        beforeNode.nextNode = newNode;
        afterNode.previousNode = newNode;
        length++;
        return true;
    }

    public int remove(int index) {
        if (index < 0 || index >= length) {
            System.out.println("Enter Correct Index");
            return -1;
        }
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();

        Node tempNode = getNode(index);
        tempNode.previousNode.nextNode = tempNode.nextNode;
        tempNode.nextNode.previousNode = tempNode.previousNode;
        tempNode.nextNode = null;
        tempNode.previousNode = null;
        length--;
        return tempNode.value;
    }

    public boolean isPalindrome() {
        if (length == 0) {
            System.out.println("Create Doubly LinkedList");
            return false;
        }
        Node leftNode = headNode;
        Node rightNode = tailNode;

        for (int i = 0; i < length / 2; i++) {
            if (leftNode.value != rightNode.value)
                return false;
            leftNode = leftNode.nextNode;
            rightNode = rightNode.previousNode;
        }
        return true;
    }

    public void reverse() {
        if (length == 0) {
            System.out.println("Create Doubly LinkedList");
            return;
        }

        Node tempNode = headNode;
        Node nextNode = tempNode;
        for (int i = 0; i < length; i++) {
            nextNode = tempNode.nextNode;
            tempNode.nextNode = tempNode.previousNode;
            tempNode.previousNode = nextNode;
            tempNode = nextNode;
        }

        tempNode = headNode;
        headNode = tailNode;
        tailNode = tempNode;
    }

    public DoublyLinkedList partitionList(int value) {
        if (length == 0) {
            System.out.println("\nCreate Doubly Linked List");
            return new DoublyLinkedList();
        }
        DoublyLinkedList smallDoublyLL = new DoublyLinkedList();
        DoublyLinkedList largeDoublyLL = new DoublyLinkedList();
        Node tempNode = headNode;
        for (int i = 0; i < length; i++) {
            if (tempNode.value < value) {
                smallDoublyLL.append(tempNode.value);
            } else {
                largeDoublyLL.append(tempNode.value);
            }
            tempNode = tempNode.nextNode;
        }
        tempNode = largeDoublyLL.headNode;
        for (int i = 0; i < largeDoublyLL.length; i++) {
            smallDoublyLL.append(tempNode.value);
            tempNode = tempNode.nextNode;
        }
        return smallDoublyLL;
    }

    public void reverseBetween(int startPosition, int endPosition) {
        if (startPosition < 1 || endPosition > length) {
            System.out.println("\nEnter correct Position");
            return;
        }

        Node leftNode = headNode;
        Node rightNode = tailNode;

        for (int i = 1; i < startPosition; i++) {
            leftNode = leftNode.nextNode;
        }
        for (int i = length - 1; i > endPosition - 1; i--) {
            rightNode = rightNode.previousNode;
        }

        Node tempNode = leftNode;
        Node nextNode = tempNode;
        for (int i = startPosition; i <= endPosition; i++) {
            nextNode = tempNode.nextNode;
            tempNode.nextNode = tempNode.previousNode;
            tempNode.previousNode = nextNode;
            tempNode = nextNode;
        }

        leftNode.nextNode.nextNode = rightNode;
        rightNode.previousNode.previousNode = leftNode;

        tempNode = leftNode.nextNode;
        leftNode.nextNode = rightNode.previousNode;
        rightNode.previousNode = tempNode;
    }

    public void swapPairs() {
        if (length < 2) {
            return;
        }

        Node current = headNode;
        headNode = current.nextNode;

        Node prevPairTail = null;

        while (current != null && current.nextNode != null) {
            Node first = current;
            Node second = current.nextNode;
            Node nextPair = second.nextNode;

            if (prevPairTail != null) {
                prevPairTail.nextNode = second;
            }
            second.previousNode = prevPairTail;

            second.nextNode = first;
            first.previousNode = second;
            first.nextNode = nextPair;

            if (nextPair != null) {
                nextPair.previousNode = first;
            }

            prevPairTail = first;
            current = nextPair;
        }

        if (current != null) {
            prevPairTail.nextNode = current;
            current.previousNode = prevPairTail;
            tailNode = current;
        } else {
            tailNode = prevPairTail;
        }
    }
}
