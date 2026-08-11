public class _77_DFT_PreOrder {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("\n\n");
        System.out.println("Depth First Traversal (PreOrder):");
        System.out.println(myBST.depthFirstTraversalPreOrder());
        System.out.println("\n\n");
    }
}
