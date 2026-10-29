public class _19_Even_Odd_Positions {

    public static long totalFine(int date, int car[], int fine[]) {
        // code here
        long totalFine = 0;
        boolean isDateEven = (date % 2 == 0);

        for (int i = 0; i < car.length; i++) {
            boolean isCarEven = (car[i] % 2 == 0);

            if (isDateEven != isCarEven) {
                totalFine += fine[i];
            }
        }

        return totalFine;
    }

    public static void main(String args[]) {
        int car[] = new int[] { 2375, 7682, 2325, 2352 };
        int fine[] = new int[] { 250, 500, 350, 200 };
        int date = 12;

        long totalFineCollected = totalFine(date, car, fine);
        System.out.println(totalFineCollected);
    }
}