// Practical_15.java

// Parent class
class ParentClass {
    // Method in the parent class
    void displayMessage() {
        System.out.println("This is the parent class");
    }
}

// Child class extending the parent class
class ChildClass extends ParentClass {
    // Method in the child class
    void displayMessage() {
        // Using super to call the method from the parent class
        super.displayMessage();
        System.out.println("This is the child class");
    }
}

// Main class
public class Practical_15 {
    public static void main(String[] args) {
        // Creating an object of the child class
        ChildClass child = new ChildClass();

        // Calling the method of the child class
        child.displayMessage();
    }
}

