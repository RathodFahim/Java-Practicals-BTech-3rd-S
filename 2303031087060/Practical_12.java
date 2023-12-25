// Practical_12.java

// Sample class representing an object
class SampleObject {
    // Fields (attributes) of the object
    String name;
    int age;

    // Constructor to initialize the object
    public SampleObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the object
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Practical_12 {
    public static void main(String[] args) {
        // Creating an object of SampleObject
        SampleObject myObject = new SampleObject("John Doe", 25);

        // Using the object
        System.out.println("Object information:");
        myObject.displayInfo();
    }
}
