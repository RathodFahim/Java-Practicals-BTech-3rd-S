import java.util.Random;
import java.util.Scanner;

public class Practical_13 {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;

        // Initialize variables
        int userGuess;
        int numberOfGuesses = 0;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        do {
            // Ask the user for a guess
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;

            // Check if the guess is correct, too high, or too low
            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

        } while (userGuess != targetNumber);

        // Close the Scanner
        scanner.close();
    }
}
