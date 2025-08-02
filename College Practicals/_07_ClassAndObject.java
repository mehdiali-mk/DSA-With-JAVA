/*
 * 7. Write a Java program to demonstrate class and object.
 */

class Car {

    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class _07_ClassAndObject {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic", 2020);

        System.out.println("Car 1:");
        car1.displayInfo();
        System.out.println("\nCar 2:");
        car2.displayInfo();
    }
}
