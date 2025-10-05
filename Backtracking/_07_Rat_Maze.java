/*

 * Question 1 :
 * Rat in a Maze
   You are given a starting position for a rat which is stuck in a maze at an initial point (0, 0) (the maze can be thought of as a 2-dimensional plane). The maze would be given in the form of a square matrix of order N * N where the cells with value 0 represent the maze’s blocked locations while value 1 is the open/available path that the rat can take to reach its destination The rat's destination is at (N - 1, N - 1). Your task is to find all the possible paths that the rat can take to reach from source to destination in the maze. The possible directions that it can take to move in the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down) i.e. (x, y + 1) , 'L' (left) i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
   
 * (This problem is similar to Grid ways.)

 */

package Backtracking;

public class _07_Rat_Maze {

    public static void printSolution(int solutionMatrix[][]) {

        System.out.println("\n\nCorrect Way for RAT in Maze:\n");
        for (int i = 0; i < solutionMatrix.length; i++) {
            if (i == 0) {
                for (int j = 0; j < solutionMatrix.length; j++) {
                    System.out.print("- ");
                }
                System.out.println();
            }
            for (int j = 0; j < solutionMatrix.length; j++) {
                System.out.print(solutionMatrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < solutionMatrix.length; j++) {
            System.out.print("- ");
        }
        System.out.println();
        System.out.println("\n\n");
    }

    public static boolean isSafe(int maze[][], int rowNumber, int columnNumber) {
        return (rowNumber >= 0 && rowNumber < maze.length && columnNumber >= 0 && columnNumber < maze.length
                && maze[rowNumber][columnNumber] == 1);
    }

    public static boolean solveMaze(int maze[][]) {
        int sizeOfMaze = maze.length;
        int solutionMatrix[][] = new int[sizeOfMaze][sizeOfMaze];

        if (solveMazeUntil(maze, 0, 0, solutionMatrix) == false) {
            System.out.println("Solution doesn't exists.");
            return false;
        }

        printSolution(solutionMatrix);
        return true;
    }

    public static boolean solveMazeUntil(int maze[][], int rowNumber, int columnNumber, int solutionMatrix[][]) {
        if (rowNumber == maze.length - 1 && columnNumber == maze.length - 1 && maze[rowNumber][columnNumber] == 1) {
            solutionMatrix[rowNumber][columnNumber] = 1;
            return true;
        }

        if (isSafe(maze, rowNumber, columnNumber) == true) {
            if (solutionMatrix[rowNumber][columnNumber] == 1)
                return false;

            solutionMatrix[rowNumber][columnNumber] = 1;
            if (solveMazeUntil(maze, rowNumber + 1, columnNumber, solutionMatrix))
                return true;
            if (solveMazeUntil(maze, rowNumber, columnNumber + 1, solutionMatrix))
                return true;
            solutionMatrix[rowNumber][columnNumber] = 0;
            return false;
        }

        return false;
    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        solveMaze(maze);
    }
}