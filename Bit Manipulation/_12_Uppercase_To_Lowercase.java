public class _12_Uppercase_To_Lowercase {
    public static String uppercaseToLowercase(String str) {
        StringBuilder newStr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            newStr.append((char) (str.charAt(i) | ' '));
        }
        return newStr.toString();
    }

    public static void main(String args[]) {
        String name = "MEHDIALI";

        System.out.println("\n\nOriginal String = " + name);
        System.out.println("Lowercase String = " + uppercaseToLowercase(name) + "\n\n");
    }

}
