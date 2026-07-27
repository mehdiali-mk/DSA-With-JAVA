public class _51_Binary_Search_Tree_CheckValidity {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(52);
        myBST.insert(82);

        myBST.insert(48);

        myBST.rootNode.leftNode.leftNode.value = 88;

        System.out.println("\n\n");
        System.out.println("Is BST Valid = " + myBST.validate());
        System.out.println("\n\n");
    }
}
