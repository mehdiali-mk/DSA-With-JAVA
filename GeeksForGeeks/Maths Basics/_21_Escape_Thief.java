/*

Thief Trying to Escape
Difficulty: BasicAccuracy: 18.64%Submissions: 23K+Points: 1Average Time: 10m
A thief trying to escape from jail has to cross n walls whose heights are given in arr[]. In one jump, he can climb x feet, but due to the slippery nature of the walls, he slips back by y feet after every jump. Calculate the total number of jumps required to cross all walls and escape from the jail. After crossing a wall, the thief begins from ground level to cross the next wall.

Examples :

Input: arr[] = {11, 10, 10, 9}, x = 10, y = 1
Output: 5
Explanation: For wall 11, the thief crosses it in 2 jumps. For walls 10, 10, and 9, only 1 jump is needed for each wall. So, total jumps required = 2 + 1 + 1 + 1 = 5.
Input: arr[] = {25, 9}, x = 10, y = 2
Output: 4
Explanation: For wall 25, the thief crosses it in 3 jumps. For wall 9, only 1 jump is needed. So, total jumps required = 3 + 1 = 4.
Constraints:
1 ≤ n ≤ 105 
1 ≤ arr[i] ≤ 104 

*/

public class _21_Escape_Thief {

    public static int totalJumps(int[] arr, int x, int y) {
        // code here
        int totalJumps = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                totalJumps += 1;
            } else {
                int numberOfWall = arr[i];
                while (numberOfWall > x) {
                    numberOfWall -= (x - y);
                    totalJumps += 1;
                }
                totalJumps += 1;
            }
        }

        return totalJumps;
    }

    public static void main(String args[]) {
        System.out.println(totalJumps(new int[] { 25, 9 }, 10, 2));
    }
}
