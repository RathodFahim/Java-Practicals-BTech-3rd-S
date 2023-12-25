import java.util.Scanner;

public class Practical_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the latitude and longitude of city 1 (in degrees): ");
        double lat1 = input.nextDouble();
        double lon1 = input.nextDouble();

        System.out.print("Enter the latitude and longitude of city 2 (in degrees): ");
        double lat2 = input.nextDouble();
        double lon2 = input.nextDouble();

        final double R = 6371.01; // Earth's radius in km

        // Convert degrees to radians
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        // Calculate the distance between the two cities
        double distance = R * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.printf("The distance between the two cities is %.2f km", distance);
        input.close();
    }
}
