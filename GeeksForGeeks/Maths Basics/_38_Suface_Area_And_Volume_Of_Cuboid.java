public class _38_Suface_Area_And_Volume_Of_Cuboid {
    public static int[] find(int l, int b, int h) {
        // code here
        return new int[] { 2 * (l * b + b * h + h * l), l * b * h };
    }

    public static void main(String args[]) {
        System.out.println(find(1, 2, 3)[0] + " " + find(1, 2, 3)[1]);
    }
}
