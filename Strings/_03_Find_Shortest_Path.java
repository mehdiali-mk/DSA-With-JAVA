// Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
// "WNEENESENNN"

package Strings;

public class _03_Find_Shortest_Path {
    public static float findShortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);

            if (direction == 'N') {
                y++;
            } else if (direction == 'E') {
                x++;
            } else if (direction == 'S') {
                y--;
            } else if (direction == 'W') {
                x--;
            } else {
                x = 0;
                y = 0;
                return -1;
            }
        }

        return (float) Math.sqrt((x * x) + (y * y));
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";

        System.out.println("\n\nShortest path is = " + findShortestPath(path) + "\n\n");
    }
}
