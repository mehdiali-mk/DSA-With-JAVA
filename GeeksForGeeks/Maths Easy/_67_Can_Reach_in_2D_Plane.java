public class _67_Can_Reach_in_2D_Plane {
    public static boolean canReach(int a, int b, int x) {
        // code here
        int xCoordinate = 0;
        int yCoordinate = 0;
        int totalStepsCount = 0;

        if (a < xCoordinate) {
            while (xCoordinate != a) {
                xCoordinate--;
                totalStepsCount++;
            }
        } else if (a > xCoordinate) {
            while (xCoordinate != a) {
                xCoordinate++;
                totalStepsCount++;
            }
        }

        if (b < yCoordinate) {
            while (yCoordinate != b) {
                yCoordinate--;
                totalStepsCount++;
            }
        } else if (b > yCoordinate) {
            while (yCoordinate != b) {
                yCoordinate++;
                totalStepsCount++;
            }
        }

        if (totalStepsCount == x) {
            return true;
        } else if (totalStepsCount < x && (x - totalStepsCount) % 2 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        System.out.println(canReach(0, 0, 2));

    }
}
