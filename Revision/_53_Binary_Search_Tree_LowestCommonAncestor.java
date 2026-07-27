public class _53_Binary_Search_Tree_LowestCommonAncestor {
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
        System.out.println("Lowest Common Ancestor (18, 25) = " + myBST.lowestCommonAncestor(18, 25));
        System.out.println("Lowest Common Ancestor (21, 76) = " + myBST.lowestCommonAncestor(21, 76));
        System.out.println("Lowest Common Ancestor (82, 52) = " + myBST.lowestCommonAncestor(82, 52));
        System.out.println("Lowest Common Ancestor (21, 52) = " + myBST.lowestCommonAncestor(21, 52));
        System.out.println("Lowest Common Ancestor (89, 90) = " + myBST.lowestCommonAncestor(89, 90));
        System.out.println("\n\n");
    }
}
