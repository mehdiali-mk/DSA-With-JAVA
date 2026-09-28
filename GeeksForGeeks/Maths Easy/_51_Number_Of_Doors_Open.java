public class _51_Number_Of_Doors_Open {
    public static int noOfOpenDoors(int n) {
        // code here

        int zeroCount = 0;
        int totalDoorsOpen = 0;
        for (int i = 1; i <= n; i += 1 + zeroCount) {
            totalDoorsOpen++;
            zeroCount += 2;
        }

        return totalDoorsOpen;
    }

    public static void main(String args[]) {
        System.out.println(noOfOpenDoors(16));
    }
}
