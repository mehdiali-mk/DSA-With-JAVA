public class _55_Minimum_Timmings {

    public static int minTime(int[] a, int[] b) {
        // code here
        if (a == null || a.length == 0 || b == null || b.length == 0) {
            return 0;
        }
        long technique1Time = 0;
        long technique2Time = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                technique1Time += a[i];
                technique2Time += b[i];
            } else {
                technique1Time += b[i];
                technique2Time += a[i];
            }
        }

        return (int) Math.min(technique1Time, technique2Time);
    }

    public static void main(String args[]) {
        int a[] = new int[] { 1, 3, 1, 2 };
        int b[] = new int[] { 2, 2, 3, 1 };

        System.out.println(minTime(a, b));
    }
}
