/*
 * Question 2 :
 * Lonely Numbers in ArrayList (MEDIUM)
 * You are given an integer arraylist nums. A number x is lonely when it appears
 * only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the
 * arraylist. Return all lonely numbers in nums. You may return the answer in
 * any order.
 * 
 * Sample Input 1 : nums = [10,6,5,8]
 * Sample Output 1 : [10,8]
 * 
 * Explanation :
 * - 10 is a lonely number since it appears exactly once and 9 and 11 does not
 * appear in nums.
 * - 8 is a lonely number since it appears exactly once and 7 and 9 does not
 * appear in nums.
 * - 5 is not a lonely number since 6 appears in nums and vice versa Hence, the
 * lonely numbers in nums are [10, 8]. Note that [8, 10] may also be returned.
 * 
 * Sample Input 2 : nums = [1,3,5,3]
 * Sample Output 2 : [1,5]
 * Explanation :
 * - 1 is a lonely number since it appears exactly once and 0 and 2 does not
 * appear in nums.
 * - 5 is a lonely number since it appears exactly once and 4 and 6 does not
 * appear in nums.
 * - 3 is not a lonely number since it appears twice.
 * Hence, the lonely numbers in nums are [1, 5].
 * 
 * Note that [5, 1] may also be returned.
 * 
 * Constraints :
 * ● 1 <= nums.size() <= 105
 * ● 0 <= nums.get(i) <= 106
 * 
 */

import java.util.ArrayList;
import java.util.Collections;

public class _11_Lonely_Number {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> myArrayList) {
        Collections.sort(myArrayList);
        ArrayList<Integer> lonelyList = new ArrayList<>();

        for (int i = 1; i < myArrayList.size() - 1; i++) {
            if (myArrayList.get(i - 1) + 1 < myArrayList.get(i) && myArrayList.get(i) + 1 < myArrayList.get(i + 1)) {
                lonelyList.add(myArrayList.get(i));
            }
        }

        if (myArrayList.size() == 1) {
            lonelyList.add(myArrayList.get(0));
        }

        if (myArrayList.size() > 1) {
            if (myArrayList.get(0) + 1 < myArrayList.get(1)) {
                lonelyList.add(myArrayList.get(0));
            }
            if (myArrayList.get(myArrayList.size() - 2) + 1 < myArrayList.get(myArrayList.size() - 1)) {
                lonelyList.add(myArrayList.get(myArrayList.size() - 1));
            }
        }

        return lonelyList;
    }

    public static void main(String args[]) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(10);
        myArrayList.add(6);
        myArrayList.add(5);
        myArrayList.add(8);

        ArrayList<Integer> lonelyList = findLonely(myArrayList);
        System.out.println("\n\nOriginal Array List:\n" + myArrayList);
        System.out.println("\nLonely Array List:\n" + lonelyList + "\n\n");

    }
}