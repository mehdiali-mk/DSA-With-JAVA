/*
Question 1
Maximum Balanced String Partitions
We have balanced string str of size N with an equal number of L and R, the task is to find a
maximum number X, such that a given string can be partitioned into X balanced substring. A
string is called to be balanced if the number of 'L's in the string equals the number of 'Rs.
Input . "LRRRRLLRLLRL"
Output : 3

*/

public class _08_Maximum_Balanced_String {
    static int balancedString(String str) {
        int lengthOfString = str.length();

        if (lengthOfString == 0)
            return 0;

        int r = 0, l = 0, answer = 0;
        for (int i = 0; i < lengthOfString; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        String str = "LLRRRLLRRL";

        System.out.println("\n\n\nOriginal String = " + str);
        System.out.println("Maximum Balanced String = " + balancedString(str) + "\n\n\n");
    }
}
