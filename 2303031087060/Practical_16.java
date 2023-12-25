// Practical_16.java

// Outer class
class OuterClass {
    private int outerData = 10;

    // Inner class
    class InnerClass {
        // Method to access outerData from inner class
        void accessOuterData() {
            System.out.println("Innerclass: Accessing outerdata from innerclass: " + outerData);
        }
    }

    // Method to access innerData from outer class
    void accessInnerData() {
        // Creating an object of the inner class
        InnerClass inner = new InnerClass();

        // Calling the method of the inner class
        inner.accessOuterData();
    }
}

// Main class
public class Practical_16 {
    public static void main(String[] args) {
        // Creating an object of the outer class
        OuterClass outer = new OuterClass();

        // Calling the method of the outer class to access inner data
        outer.accessInnerData();
    }
}
