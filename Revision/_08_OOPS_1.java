public class _08_OOPS_1 {
    public static void main(String args[]) {

        Pen myPen = new Pen("Pentonic", "Blue", 5);

        myPen.displayDetails();
    }

}

class Pen {
    String brand;
    String color;
    int tipSize;

    Pen(String brand, String color, int tipSize) {
        this.brand = brand;
        this.color = color;
        this.tipSize = tipSize;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTipSize(int newTipSize) {
        this.tipSize = newTipSize;
    }

    void displayDetails() {
        System.out.print("\nPen Details:\n");
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("TipSize: " + this.tipSize);
        System.out.println("\n");
    }
}