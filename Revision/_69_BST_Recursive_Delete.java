public class _69_BST_Recursive_Delete {
    public static void main(String args[]) {
        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);

        System.out.println("\n\n");
        System.out.println("\t" + myBST.rootNode.value);
        System.out.println();
        System.out.println();

        System.out.print("" + myBST.rootNode.leftNode.value);
        System.out.print("\t\t" + myBST.rootNode.rightNode.value);
        System.out.println();
        System.out.println();

        myBST.deleteNode(2);
        System.out.println();
        System.out.println("\t" + myBST.rootNode.value);
        System.out.println();
        System.out.println();

        System.out.print("" + myBST.rootNode.leftNode.value);
        System.out.print("\t\t" + myBST.rootNode.rightNode);
        System.out.println();
        System.out.println();

        myBST.insert(8);
        myBST.insert(5);
        myBST.insert(4);
        myBST.insert(6);
        myBST.insert(10);
        myBST.insert(12);

        myBST.deleteNode(5);

        System.out.println("\n\n");
    }
}
