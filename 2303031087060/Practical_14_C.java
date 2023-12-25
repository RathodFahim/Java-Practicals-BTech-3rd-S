// Base class
class Shape {
    // Method in the base class
    public void draw() {
        System.out.println("Drawing the shape");
    }
}

// Derived class (inherits from Shape)
class Circle extends Shape {
    // Method overriding in the derived class
    @Override
    public void draw() {
        System.out.println("Drawing the circle");
    }
}

public class Practical_14_C {
    public static void main(String[] args) {
        // Create an instance of the Circle class
        Circle myCircle = new Circle();

        // Call the draw method, demonstrating polymorphism
        drawShape(myCircle);
    }

    // Polymorphic method that takes any Shape and calls its draw method
    public static void drawShape(Shape shape) {
        shape.draw();
    }
}
