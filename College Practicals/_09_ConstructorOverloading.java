/*
 * 9. Write a Java program for constructor overloading.
 */

public class _09_ConstructorOverloading {
    private String name;
    private int age;

    // Constructor with no parameters
    public _09_ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    // Constructor with one parameter (name)
    public _09_ConstructorOverloading(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor with two parameters (name and age)
    public _09_ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        _09_ConstructorOverloading obj1 = new _09_ConstructorOverloading();
        _09_ConstructorOverloading obj2 = new _09_ConstructorOverloading("Het");
        _09_ConstructorOverloading obj3 = new _09_ConstructorOverloading("Mehdiali", 18);
        // Displaying information using the displayInfo() method
        System.out.println("Object 1:");
        obj1.displayInfo();
        System.out.println("\nObject 2:");
        obj2.displayInfo();
        System.out.println("\nObject 3:");
        obj3.displayInfo();
    }
}
