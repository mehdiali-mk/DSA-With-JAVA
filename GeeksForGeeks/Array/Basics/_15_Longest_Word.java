public class _15_Longest_Word {

    public static String longest(String[] arr) {
        // code here
        if (arr == null || arr.length == 0)
            return "";

        String longest = arr[0];

        for (String str : arr) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return longest;
    }

    public static void main(String args[]) {
        String myArray[] = new String[] { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };

        System.out.println(longest(myArray));
    }
}