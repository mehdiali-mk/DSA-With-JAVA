public class _34_Jumpy_Ball {
    public static int jumpyBall(int h) {
        // code here
        int totalDistance = 0;
        while (h >= 1) {
            totalDistance += h * 2;
            h /= 2;
        }
        return totalDistance;
    }

    public static void main(String args[]) {
        System.out.println(jumpyBall(20));
    }
}