// Question 2 :
// Simplify Path
// We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin
// with ‘/’ ( root directory ), a dot in path represent current directory and double dot represents
// parent directory.
// Sample Input 1 : /apnacollege/
// Sample Output 1 : /apnacollege
// Sample Input 1 : /a/..
// Sample Output 1 : /

import java.util.Stack;

public class _12_Stack_Simplified_Path {

    public static String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String response = "";
        response += "/";

        for (int i = 0; i < path.length(); i++) {
            String directory = "";
            while (i < path.length() && path.charAt(i) == '/') {
                i++;
            }

            while (i < path.length() && path.charAt(i) != '/') {
                directory += path.charAt(i);
                i++;
            }

            if (directory.equals("..") == true) {
                if (!st.isEmpty())
                    st.pop();
            } else if (directory.equals(".") == true) {
                continue;
            } else if (directory.length() != 0) {
                st.push(directory);
            }
        }

        Stack<String> st1 = new Stack<>();
        while (!st.isEmpty()) {
            st1.push(st.pop());
        }

        while (!st1.isEmpty()) {
            if (st1.size() != 1)
                response += (st1.pop() + " /");
            else
                response += (st1.pop());
        }
        return response;
    }

    public static void main(String args[]) {
        String path = new String("/a/./b/../../c/");
        String simplifiedPath = simplifyPath(path);

        System.out.println("\n\nOriginal Path = " + path);
        System.out.println("Simplified Path = " + simplifiedPath + "\n\n");
    }
}
