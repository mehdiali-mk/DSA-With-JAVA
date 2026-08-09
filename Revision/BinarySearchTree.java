import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public Node rootNode;

    class Node {
        int value;
        Node rightNode;
        Node leftNode;

        Node(int value) {
            this.value = value;
            rightNode = null;
            leftNode = null;
        }
    }

    BinarySearchTree() {
        rootNode = null;
    }

    BinarySearchTree(int value) {
        rootNode = new Node(value);
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (rootNode == null) {
            rootNode = newNode;
            return true;
        }
        Node tempNode = rootNode;
        while (true) {
            if (newNode.value == tempNode.value)
                return false;

            if (newNode.value < tempNode.value) {
                if (tempNode.leftNode == null) {
                    tempNode.leftNode = newNode;
                    return true;
                }
                tempNode = tempNode.leftNode;
            } else {
                if (tempNode.rightNode == null) {
                    tempNode.rightNode = newNode;
                    return true;
                }
                tempNode = tempNode.rightNode;
            }
        }
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null)
            return new Node(value);

        if (currentNode.value > value) {
            currentNode.leftNode = rInsert(currentNode.leftNode, value);
        } else if (currentNode.value < value) {
            currentNode.rightNode = rInsert(currentNode.rightNode, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (rootNode == null) {
            rootNode = new Node(value);
            return;
        }
        rInsert(rootNode, value);
    }

    public boolean contains(int value) {
        if (rootNode == null)
            return false;
        Node tempNode = rootNode;
        while (tempNode != null) {
            if (value < tempNode.value) {
                tempNode = tempNode.leftNode;
            } else if (value > tempNode.value) {
                tempNode = tempNode.rightNode;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null)
            return false;

        if (currentNode.value == value)
            return true;

        if (currentNode.value > value) {
            return rContains(currentNode.leftNode, value);
        } else {
            return rContains(currentNode.rightNode, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(rootNode, value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null)
            return null;

        if (currentNode.value > value) {
            currentNode.leftNode = deleteNode(currentNode.leftNode, value);
        } else if (currentNode.value < value) {
            currentNode.rightNode = deleteNode(currentNode.rightNode, value);
        } else {
            if (currentNode.leftNode == null && currentNode.rightNode == null) {
                return null;
            } else if (currentNode.leftNode == null) {
                currentNode = currentNode.rightNode;
            } else if (currentNode.rightNode == null) {
                currentNode = currentNode.leftNode;
            } else {
                int smallestValue = findMinimumValue(currentNode.rightNode);
                currentNode.value = smallestValue;
                currentNode.rightNode = deleteNode(currentNode.rightNode, smallestValue);
            }
        }
        return currentNode;
    }

    private int findMinimumValue(Node currentNode) {
        while (currentNode.leftNode != null) {
            currentNode = currentNode.leftNode;
        }
        return currentNode.value;
    }

    public void deleteNode(int value) {
        deleteNode(rootNode, value);
    }

    public boolean validate() {
        return isValid(rootNode, null, null);
    }

    public boolean isValid(Node currentNode, Integer minimum, Integer maximum) {
        if (currentNode == null)
            return true;

        if ((minimum != null && currentNode.value <= minimum) || (maximum != null && currentNode.value >= maximum)) {
            return false;
        }

        return isValid(currentNode.leftNode, minimum, currentNode.value)
                && isValid(currentNode.rightNode, currentNode.value, maximum);
    }

    public Integer kthSmallest(int k) {
        if (k <= 0) {
            return null;
        }
        int[] count = { 0 };
        return findKthSmallest(rootNode, k, count);
    }

    private Integer findKthSmallest(Node currentNode, int k, int[] count) {
        if (currentNode == null) {
            return null;
        }

        Integer leftResult = findKthSmallest(currentNode.leftNode, k, count);
        if (leftResult != null) {
            return leftResult;
        }

        count[0]++;
        if (k == count[0]) {
            return currentNode.value;
        }

        return findKthSmallest(currentNode.rightNode, k, count);
    }

    public Integer lowestCommonAncestor(int firstValue, int secondValue) {
        return findLowestCommonAncestor(rootNode, firstValue, secondValue);
    }

    private Integer findLowestCommonAncestor(Node currentNode, int firstValue, int secondValue) {
        if (currentNode == null) {
            return null;
        }
        Integer result = null;

        if (firstValue < currentNode.value && secondValue < currentNode.value) {
            result = findLowestCommonAncestor(currentNode.leftNode, firstValue, secondValue);
        } else if (firstValue > currentNode.value && secondValue > currentNode.value) {
            result = findLowestCommonAncestor(currentNode.rightNode, firstValue, secondValue);
        } else if (firstValue == currentNode.value || secondValue == currentNode.value) {
            return currentNode.value;
        } else if ((firstValue < currentNode.value && secondValue > currentNode.value)
                || (firstValue > currentNode.value && secondValue < currentNode.value)) {

            return currentNode.value;
        } else {
            return null;
        }

        if (result != null) {
            return result;
        }
        return null;
    }

    public ArrayList<Integer> breadthFirstTraversal() {
        Node currentNode = rootNode;
        Queue<Node> myQueue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();

        myQueue.add(currentNode);
        while (myQueue.size() > 0) {
            currentNode = myQueue.remove();
            result.add(currentNode.value);
            if (currentNode.leftNode != null) {
                myQueue.add(currentNode.leftNode);
            }
            if (currentNode.rightNode != null) {
                myQueue.add(currentNode.rightNode);
            }
        }

        return result;
    }

    public ArrayList<Integer> depthFirstTraversalPreOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class traversal {
            traversal(Node currentNode) {
                result.add(currentNode.value);
                if (currentNode.leftNode != null) {
                    new traversal(currentNode.leftNode);
                }
                if (currentNode.rightNode != null) {
                    new traversal(currentNode.rightNode);
                }
            }
        }

        new traversal(rootNode);
        return result;
    }

    public ArrayList<Integer> depthFirstTraversalInOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class traversal {
            traversal(Node currentNode) {
                if (currentNode.leftNode != null) {
                    new traversal(currentNode.leftNode);
                }
                result.add(currentNode.value);
                if (currentNode.rightNode != null) {
                    new traversal(currentNode.rightNode);
                }
            }
        }

        new traversal(rootNode);
        return result;
    }

    public ArrayList<Integer> depthFirstTraversalPostOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class traversal {
            traversal(Node currentNode) {
                if (currentNode.leftNode != null) {
                    new traversal(currentNode.leftNode);
                }
                if (currentNode.rightNode != null) {
                    new traversal(currentNode.rightNode);
                }
                result.add(currentNode.value);
            }
        }

        new traversal(rootNode);
        return result;
    }

    public void clearBST() {
        clearMyBST(rootNode);
    }

    private void clearMyBST(Node currentNode) {
        Node leftNode = currentNode.leftNode;
        Node rightNode = currentNode.rightNode;
        if (leftNode.leftNode == null && leftNode.rightNode == null) {
            currentNode.leftNode = null;
        }
        if (rightNode.leftNode == null && rightNode.rightNode == null) {
            currentNode.rightNode = null;
        }
        clearMyBST(currentNode.rightNode);
        clearMyBST(currentNode.leftNode);
    }

    public void createBSTWithBFS(ArrayList<Integer> myElements) {

        for (int element : myElements) {
            insert(element);
        }
    }
}
