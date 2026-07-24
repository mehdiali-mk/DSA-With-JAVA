public class Queue {
    private Node first = null;
    private Node last = null;
    private int length = 0;

    class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
            nextNode = null;
        }
    }

    Queue(int value) {
        Node newNode = new Node(value);
        first = last = newNode;
        length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = last = newNode;
        } else {
            last.nextNode = newNode;
            last = newNode;
        }
        length++;
    }

    public int dequeue() {
        if (length == 0) {
            System.out.println("Create Queue");
            return -1;
        }
        Node tempNode = first;
        if (length == 1) {
            first = last = null;
        } else {
            first = first.nextNode;
            tempNode.nextNode = null;
        }
        length--;
        return tempNode.value;
    }

    public void printQueue() {
        if (length == 0) {
            System.out.println("Create Queue");
            return;
        }
        System.out.print("Print Queue: ");
        Node tempNode = first;
        for (int i = 0; i < length; i++) {
            System.out.print(tempNode.value + (i != length - 1 ? " -> " : " "));
            tempNode = tempNode.nextNode;
        }
        System.out.println();
    }

    public int getFirstValue() {
        if (first == null) {
            System.out.println("Create Queue");
            return -1;
        }
        return first.value;
    }

    public int getLastValue() {
        if (last == null) {
            System.out.println("Create Queue");
            return -1;
        }
        return last.value;
    }

    public int getLengthValue() {
        return length;
    }

    public void getFirst() {
        System.out.println("First: " + getFirstValue());
    }

    public void getLast() {
        System.out.println("Last: " + getLastValue());
    }

    public void getLength() {
        System.out.println("Length: " + getLengthValue());
    }

}
