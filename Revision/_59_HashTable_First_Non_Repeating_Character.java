import java.util.HashMap;

public class _59_HashTable_First_Non_Repeating_Character {
    public static void main(String args[]) {
        String myString = "Mehdiali Kadiwala";

        System.out.println("\n\n");
        System.out.println("Original String = " + myString);

        int index = findFirstNonRepeatingCharacter(myString);
        System.out.println("\nFirst Non-Repeating Character:");
        System.out.println(((index != -1) ? (myString.charAt(index) + " at index " + index) : "All are repeating."));
        System.out.println("\n\n");
    }

    public static int findFirstNonRepeatingCharacter(String myString) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();

        for (int i = 0; i < myString.length(); i++) {
            if (myHashMap.get(myString.charAt(i)) == null) {
                myHashMap.put(myString.charAt(i), 1);
            } else {
                myHashMap.put(myString.charAt(i), myHashMap.get(myString.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < myString.length(); i++) {
            if (myHashMap.get(myString.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
