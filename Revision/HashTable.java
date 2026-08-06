import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    class Node {
        String key;
        int value;
        Node nextNode;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
            nextNode = null;
        }
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.print(i + ":");
            Node tempNode = dataMap[i];
            while (tempNode != null) {
                System.out.print("\n  { " + tempNode.key + " = " + tempNode.value + " } ");
                tempNode = tempNode.nextNode;
            }
            System.out.println();
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] myCharacterArray = key.toCharArray();
        for (int i = 0; i < myCharacterArray.length; i++) {
            int charAscii = myCharacterArray[i];
            hash = (hash + charAscii * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node tempNode = dataMap[index];
            while (tempNode.nextNode != null) {
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node tempNode = dataMap[index];
        while (tempNode != null) {
            if (tempNode.key.equals(key)) {
                return tempNode.value;
            }
            tempNode = tempNode.nextNode;
        }
        return -1;
    }

    public ArrayList getAllKeys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Node tempNode = dataMap[i];
            while (tempNode != null) {
                allKeys.add(tempNode.key);
                tempNode = tempNode.nextNode;
            }
        }
        return allKeys;
    }
}