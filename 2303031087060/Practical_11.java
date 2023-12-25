// Practical_11.java

public class Practical_11 {
    public static void main(String[] args) {
        // Sample array
        int[] array = {1, 2, 3, 4, 5};

        // Calculate the sum
        int sum = calculateSum(array);

        // Display the result
        System.out.println("Sum of the elements in the array: " + sum);
    }

    // Method to calculate the sum of elements in an array
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
