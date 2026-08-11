public class _76_Breadth_First_Traversal {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("\n\n");
        System.out.println("Breadth First Traversal:");
        System.out.println(myBST.breadthFirstTraversal());
        System.out.println("\n\n");
    }

}
