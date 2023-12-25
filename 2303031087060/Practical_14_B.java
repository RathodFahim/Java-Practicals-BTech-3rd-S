// Base class
class Animal {
    // Method in the base class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (inherits from Animal)
class Dog extends Animal {
    // Method in the derived class
    public void bark() {
        System.out.println("Dog barks.");
    }
}

public class Practical_14_B {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();

        // Call methods from the base and derived classes
        myDog.makeSound();
        myDog.bark();
    }
}
