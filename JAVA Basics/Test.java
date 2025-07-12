public class Test {
    public static void main(String[] args) {
        float x, y, z;
        x = y = z = 2;
        System.out.println(x + " " + y + " " + z);
        x += y;
        System.out.println(x + " " + y + " " + z);
        y -= z;
        System.out.println(x + " " + y + " " + z);
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
}