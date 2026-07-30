public class _54_HashTable_Set {
    public static void main(String args[]) {
        HashTable myHashTable = new HashTable();

        myHashTable.printTable();
        myHashTable.set("Najarhusain", 100);
        myHashTable.set("Husenabanu", 80);
        myHashTable.set("Ahesanali", 60);
        myHashTable.set("Mehdiali", 40);
        myHashTable.set("Saberafatema", 20);
        myHashTable.set("Nafeesafatema", 0);
        System.out.println("\n\n");
        myHashTable.printTable();
    }
}
