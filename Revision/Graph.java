import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjacentList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if (adjacentList.get(vertex) == null) {
            adjacentList.put(vertex, new ArrayList<String>());
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        ArrayList<String> vertex1ArrayList = adjacentList.get(vertex1);
        ArrayList<String> vertex2ArrayList = adjacentList.get(vertex2);

        if (vertex1ArrayList == null || vertex2ArrayList == null) {
            System.out.println("Please provide valid vertex.");
            return false;
        }

        if (!vertex1ArrayList.contains(vertex2))
            vertex1ArrayList.add(vertex2);
        if (!vertex2ArrayList.contains(vertex1))
            vertex2ArrayList.add(vertex1);

        return true;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        ArrayList<String> vertex1ArrayList = adjacentList.get(vertex1);
        ArrayList<String> vertex2ArrayList = adjacentList.get(vertex2);

        if (vertex1ArrayList == null || vertex2ArrayList == null) {
            System.out.println("Please provide valid vertex.");
            return false;
        }

        vertex1ArrayList.remove(vertex2);
        vertex2ArrayList.remove(vertex1);
        return true;
    }

    public boolean removeVertex(String vertex1) {
        ArrayList<String> vertex1ArrayList = adjacentList.get(vertex1);

        if (vertex1ArrayList == null) {
            System.out.println("Please provide valid vertex.");
            return false;
        }

        if (!vertex1ArrayList.isEmpty()) {
            while (!vertex1ArrayList.isEmpty()) {
                removeEdge(vertex1, vertex1ArrayList.get(0));
            }
        }

        adjacentList.remove(vertex1);

        return true;
    }

    public void printGraph() {
        System.out.println(adjacentList);
    }
}