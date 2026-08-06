public class _63_Graph_Add_Edge {
    public static void main(String args[]) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        System.out.println("\n\n");
        myGraph.printGraph();

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "G");

        myGraph.printGraph();
        System.out.println("\n\n");
    }
}
