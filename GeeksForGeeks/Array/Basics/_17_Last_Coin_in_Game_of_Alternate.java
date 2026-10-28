public class _17_Last_Coin_in_Game_of_Alternate {

    public static int coin(int[] arr) {
        // code here
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex != lastIndex) {
            if (arr[firstIndex] >= arr[lastIndex]) {
                firstIndex++;
            } else {
                lastIndex--;
            }
        }

        return arr[firstIndex];
    }

    public static void main(String args[]) {
        int myArray[] = new int[] { 5, 3, 1, 6, 9 };

        System.out.println(coin(myArray));
    }

}