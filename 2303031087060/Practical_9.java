import java.util.Scanner;

public class Practical_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the diamond (odd number): ");
        int height = input.nextInt();
        int mid = height / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if (i <= mid) {
                    if (j >= mid - i && j <= mid + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= mid - (height - 1 - i) && j <= mid + (height - 1 - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        input.close();
    }
}
