public class _40_Country_At_War {

    public static String countryAtWar(int[] arr1, int[] arr2) {
        // code here
        int winningOfA = 0;
        int winningOfB = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                winningOfA++;
            } else if (arr1[i] < arr2[i]) {
                winningOfB++;
            }
        }

        if (winningOfA > winningOfB) {
            return "A";
        } else if (winningOfA < winningOfB) {
            return "B";
        } else {
            return "DRAW";
        }
    }

    public static void main(String args[]) {
        int myArray1[] = new int[] { 2, 2 };
        int myArray2[] = new int[] { 5, 5 };

        System.out.println(countryAtWar(myArray1, myArray2));
    }
}