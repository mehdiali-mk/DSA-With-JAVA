public class Stack {
    class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
            nextNode = null;
        }
    }

    private Node top = null;
    private int height = 0;

    Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        System.out.print("\nPrint Stack: ");
        Node tempNode = top;
        for (int i = 0; i < height; i++) {
            System.out.print(tempNode.value + (i != height - 1 ? " -> " : " "));
            tempNode = tempNode.nextNode;
        }
        System.out.println();
    }

    public int getTopValue() {
        if (height == 0) {
            System.out.println("Stack Empty");
            return -1;
        }
        return top.value;
    }

    public void getTop() {
        System.out.println("Top: " + getTopValue());
    }

    public int getHeightValue() {
        return height;
    }

    public void getHeight() {
        System.out.println("Height: " + getHeightValue());
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.nextNode = top;
            top = newNode;
        }
        height++;
    }

    public int pop() {
        if (height == 0) {
            System.out.println("\nCreate Stack");
            return -1;
        }
        Node tempNode = top;
        top = top.nextNode;
        tempNode.nextNode = null;
        height--;
        return tempNode.value;
    }

}