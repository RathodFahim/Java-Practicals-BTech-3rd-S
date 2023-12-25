import java.util.Scanner;

public class Practical_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight on Earth (in kg): ");
        double weightOnEarth = input.nextDouble();

        double weightOnMars = (weightOnEarth / 9.81) * 3.71;

        System.out.println("Your weight on Mars would be " + weightOnMars + " kg.");
        input.close();
    }
}

