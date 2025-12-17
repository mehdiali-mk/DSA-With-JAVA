import java.util.LinkedList;

public class _06_Queue_First_Non_Repeating_Character_in_Stream_Of_Character {

    public static void firstNonRepeatingCharacter(String str) {
        int frequency[] = new int[26];
        LinkedList<Character> myQueue = new LinkedList<>();

        System.out.print("First Non Repeating:\n[ ");
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            myQueue.add(character);
            frequency[character - 'a']++;

            while (!myQueue.isEmpty() && frequency[myQueue.peek() - 'a'] > 1) {
                myQueue.remove();
            }

            if (myQueue.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(myQueue.peek() + " ");
            }
        }
        System.out.println("]\n\n");
    }

    public static void main(String args[]) {
        String myString = "aabccxb";

        System.out.println("\n\nOriginal String = " + myString);
        firstNonRepeatingCharacter(myString);
    }
}