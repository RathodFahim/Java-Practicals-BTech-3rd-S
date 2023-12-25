import java.util.Scanner;

public class Practical_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double temperature, convertedTemperature;

        System.out.println("Temperature Conversion Menu:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            temperature = input.nextDouble();
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println(temperature + " Celsius = " + convertedTemperature + " Fahrenheit");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            temperature = input.nextDouble();
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println(temperature + " Fahrenheit = " + convertedTemperature + " Celsius");
        } else {
            System.out.println("Invalid choice!");
        }
        input.close();
    }
}
