package Strings;

public class _05_Uppercase_Each_Letter {
    public static String convertToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        char character = Character.toUpperCase(str.charAt(0));
        sb.append(character);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(++i)));
            } else {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "This IS a beAUTIful dAY.";

        System.out.println("\n\nOriginal String = " + str);
        System.out.println("Converted String = " + convertToUppercase(str) + "\n\n");
    }
}
