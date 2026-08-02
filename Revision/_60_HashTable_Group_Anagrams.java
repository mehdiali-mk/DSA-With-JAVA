import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class _60_HashTable_Group_Anagrams {
    public static void main(String args[]) {
        String[] myStringArray = { "eat", "ate", "tea", "tan", "nat", "bat" };
        List<List<String>> myGroupAnagrams = groupAnagrams(myStringArray);

        System.out.println("\n\n");
        System.out.print("Original String Array = ");
        System.out.print(Arrays.toString(myStringArray));

        System.out.print("\n\nGroup Anagrams ArrayList = ");
        System.out.println(myGroupAnagrams);
        System.out.println("\n\n");
    }

    public static List<List<String>> groupAnagrams(String[] myStringArray) {
        HashMap<String, List<String>> myHashMap = new HashMap<>();

        for (String word : myStringArray) {
            char[] wordsCharacter = word.toCharArray();
            Arrays.sort(wordsCharacter);
            String sortedWord = new String(wordsCharacter);

            if (!myHashMap.containsKey(sortedWord)) {
                myHashMap.put(sortedWord, new ArrayList<>());
            }

            myHashMap.get(sortedWord).add(word);
        }

        return new ArrayList<>(myHashMap.values());
    }
}
