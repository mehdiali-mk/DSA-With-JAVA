package Recursion;

public class _12_Remove_Duplicates {
    static void removeDuplicates(String string, int stringIndex, StringBuilder newString, boolean mapArray[]) {
        if (stringIndex == string.length() - 1) {
            System.out.print(newString);
            return;
        }

        if (mapArray[(string.charAt(stringIndex)) - 'a'] == true) {
            removeDuplicates(string, stringIndex + 1, newString, mapArray);
        } else {
            mapArray[(string.charAt(stringIndex)) - 'a'] = true;
            removeDuplicates(string, stringIndex + 1, newString.append(string.charAt(stringIndex)), mapArray);
        }
    }

    public static void main(String args[]) {
        System.out.println("\n\nOriginal String = mehdialikadiwala");
        System.out.print("After removing duplicate = ");
        removeDuplicates("mehdialikadiwala", 0, new StringBuilder(""), new boolean[26]);
        System.out.println("\n\n");
    }
}
