/*
 * 10. Write a program in Java to demonstrate use of this keyword.
 */

public class _10_ThisKeyword {
    private String name;
    private int age;

    // Constructor with parameters
    public _10_ThisKeyword(String name, int age) {
        // Using 'this' to distinguish between instance variable and parameter with the
        // same name
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        // Using 'this' to refer to the current object's instance variables
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Method to update age
    public void updateAge(int age) {
        // Using 'this' to refer to the current object's instance variable
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating an object of the _10_ThisKeyword class
        _10_ThisKeyword Person = new _10_ThisKeyword("Mehdiali", 17);
        // Displaying information using the displayInfo() method
        System.out.println("Information of Person:");
        Person.displayInfo();
        // Updating age using the updateAge() method
        Person.updateAge(18);
        // Displaying updated information
        System.out.println("\nUpdated information of Person:");
        Person.displayInfo();
    }
}
