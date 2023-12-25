// Program On Exceptional Handling

import java.util.Scanner;

public class Practical_20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Enter a number: ");
      int divisor = sc.nextInt();
      int result = 10 / divisor;
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("An Arithmetic error occured " + e.getMessage());
    } catch (java.util.InputMismatchException e) {
      System.out.println("Error: Invalid input. Please enter a valid number.");
    } finally {
      System.out.println("Finally block executed.");
      sc.close();
    }

    System.out.println("Program execution continues...");

  }
}