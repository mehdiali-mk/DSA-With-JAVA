/*
 * Question 1 : Print the sum, difference and product of two complex numbers by creating a class named Complex with separate methods for each operation whose real and imaginary parts are entered by the user.
 */

package OOPs;

public class _1_Complex_Number {
    public static void main(String args[]) {
        Complex complexNumber1 = new Complex(3, 2);
        Complex complexNumber2 = new Complex(4, -1);

        Complex complexAddition = complexNumber1.add(complexNumber2);
        Complex complexSubtraction = complexNumber1.subtract(complexNumber2);
        Complex complexMultiplication = complexNumber1.Multiply(complexNumber2);

        System.out.println("\n\n2 Complex Numbers:");
        complexNumber1.display();
        complexNumber2.display();

        System.out.println("\nAddition:");
        complexAddition.display();

        System.out.println("\nSubtraction:");
        complexSubtraction.display();

        System.out.println("\nMultiplication:");
        complexMultiplication.display();
        System.out.println("\n\n");
    }

}

class Complex {
    private int realPart;
    private int imaginaryPart;

    Complex(int realPart, int imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    void display() {
        System.out.println("( " + this.realPart + " + " + (this.imaginaryPart == 1 ? "" : this.imaginaryPart) + "i )");
    }

    public Complex add(Complex complexNumber) {
        return new Complex(this.realPart + complexNumber.realPart, this.imaginaryPart + complexNumber.imaginaryPart);
    }

    public Complex subtract(Complex complexNumber) {
        return new Complex(this.realPart - complexNumber.realPart, this.imaginaryPart - complexNumber.imaginaryPart);
    }

    public Complex Multiply(Complex complexNumber) {
        return new Complex(this.realPart * complexNumber.realPart - this.imaginaryPart * complexNumber.imaginaryPart,
                this.realPart * complexNumber.imaginaryPart + this.imaginaryPart * complexNumber.realPart);
    }

}
