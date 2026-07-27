public class _52_Binary_Search_Tree_KthSmallest {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(25);

        System.out.println("\n\n");
        System.out.println("Kth Smallest (1) = " + myBST.kthSmallest(1));
        System.out.println("Kth Smallest (2) = " + myBST.kthSmallest(2));
        System.out.println("Kth Smallest (3) = " + myBST.kthSmallest(3));
        System.out.println("\n\n");
    }
}
