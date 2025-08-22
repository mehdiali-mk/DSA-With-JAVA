public class Student {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    // Method to display student info
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Creating object using parameterized constructor
        Student s1 = new Student("Mehdiali", 18);
        s1.displayInfo();
    }
}
