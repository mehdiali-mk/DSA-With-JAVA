public class _68_BST_Recursive_Insert {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(47);
        myBST.rInsert(27);
        myBST.rInsert(72);
        myBST.rInsert(18);
        myBST.rInsert(36);
        myBST.rInsert(52);
        myBST.rInsert(88);

        System.out.println("\n\n");
        System.out.println("\t\t\t\t" + myBST.rootNode.value);
        System.out.println();
        System.out.println();

        System.out.print("\t\t" + myBST.rootNode.leftNode.value);
        System.out.print("\t\t\t\t" + myBST.rootNode.rightNode.value);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.print("\t" + myBST.rootNode.leftNode.leftNode.value);
        System.out.print("\t\t" + myBST.rootNode.leftNode.rightNode.value);
        System.out.print("\t\t" + myBST.rootNode.rightNode.leftNode.value);
        System.out.print("\t\t" + myBST.rootNode.rightNode.rightNode.value);

        System.out.println("\n\n");
    }
}
