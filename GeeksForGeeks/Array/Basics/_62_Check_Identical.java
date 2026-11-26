public class _62_Check_Identical {

    public static boolean checkIdentical(int a[], int b[]) {
        // code here
        if (a == null || b == null || a.length == 0 || b.length == 0 || a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

    }
}
