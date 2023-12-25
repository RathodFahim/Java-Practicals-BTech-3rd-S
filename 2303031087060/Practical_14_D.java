// Parent class
class Parent {
    // Method in the parent class
    public void displayMessage() {
        System.out.println("Hello from parent");
    }
}

// Child class (inherits from Parent)
class Child extends Parent {
    // Method in the child class that uses super to call the parent method
    @Override
    public void displayMessage() {
        super.displayMessage(); // Calling the method in the parent class
        System.out.println("Hello from child");
    }
}

public class Practical_14_D {
    public static void main(String[] args) {
        // Create an instance of the Child class
        Child myChild = new Child();

        // Call the displayMessage method in the child class
        myChild.displayMessage();
    }
}
