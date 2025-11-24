package U2T5P2;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorial? ");
        System.out.print("Enter a number between 0 and 170: ");
        int userNumber = scanner.nextInt();
        while (userNumber > 170 || userNumber < 0) {
            System.out.print("No! Between 0 and 170: ");
            userNumber = scanner.nextInt();
        }
        int count = 1;
        double number = 1;
        while (count <= userNumber) {
            number = number * count;
            count++;
        }
        System.out.println(userNumber + "! is " + number);
    }
}
