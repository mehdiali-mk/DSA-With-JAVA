/*
Question 2 :
Connect n ropes with minimum cost
Given are N ropes of different lengths, the task is to connect these ropes into one rope with
minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
Sample Input 1 : N = 4, arr = [4 3 2 6]
Sample Output 1 : 29
Sample Input 2 : N = 2, arr = [1 2 3]
Sample Output 2 : 9
*/

import java.util.PriorityQueue;

public class _13_Queue_Connect_Rope {
    static int minimumCostToConnectRope(int array[], int number) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < number; i++) {
            pq.add(array[i]);
        }

        int result = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            result += first + second;
            pq.add(first + second);
        }
        return result;
    }

    public static void main(String args[]) {
        int length[] = { 4, 3, 2, 6 };
        int size = length.length;

        int length2[] = { 1, 2, 3 };
        int size2 = length2.length;

        System.out.println("\n\nTotal cost for size " + size + ": "
                + minimumCostToConnectRope(length, size));
        System.out.println("Total cost for size " + size2 + ": "
                + minimumCostToConnectRope(length2, size2) + "\n\n");
    }
}
