// * Friends Pairing Problem
// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.

package Recursion;

public class _13_Friends_Paring_Problem {
    static int findWaysOfParingFriends(int numberOfFriends) {
        if (numberOfFriends == 1 || numberOfFriends == 2) {
            return numberOfFriends;
        }
        return findWaysOfParingFriends(numberOfFriends - 1)
                + ((numberOfFriends - 1) * findWaysOfParingFriends(numberOfFriends - 2));
    }

    public static void main(String args[]) {
        System.out.println("\n\nTotal Ways of paring friends:\n");
        System.out.println("3 Friends = " + findWaysOfParingFriends(3) + " ways.");
        System.out.println("7 Friends = " + findWaysOfParingFriends(7) + " ways.");
        System.out.println("10 Friends = " + findWaysOfParingFriends(10) + " ways.");
        System.out.println("5 Friends = " + findWaysOfParingFriends(5) + " ways.\n\n");
    }
}
