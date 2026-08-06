public class _65_Graph_Remove_Vertex {
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

        System.out.println();
        myGraph.printGraph();

        myGraph.removeVertex("A");
        myGraph.removeVertex("B");
        // myGraph.removeVertex("B");

        System.out.println();
        myGraph.printGraph();

        System.out.println("\n\n");
    }
}
