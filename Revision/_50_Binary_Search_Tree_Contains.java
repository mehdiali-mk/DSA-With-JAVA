public class _50_Binary_Search_Tree_Contains {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(48);
        myBST.insert(48);
        System.out.println("\n\n");
        System.out.println("Contains (47) = " + myBST.contains(48));
        System.out.println("Contains (17) = " + myBST.contains(17));
        System.out.println("Contains (18) = " + myBST.contains(18));
        System.out.println("\n\n");
    }
}
