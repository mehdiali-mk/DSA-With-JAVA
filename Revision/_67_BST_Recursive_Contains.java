public class _67_BST_Recursive_Contains {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("\n\n");
        System.out.println("Is BST contains 21: " + myBST.rContains(21));
        System.out.println("Is BST contains 52: " + myBST.rContains(52));
        System.out.println("Is BST contains 98: " + myBST.rContains(98));
        System.out.println("\n\n");
    }
}
