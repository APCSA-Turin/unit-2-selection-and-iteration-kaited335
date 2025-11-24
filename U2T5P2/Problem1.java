package U2T5P2;

import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer greater than 5: ");
    int userNumber = scanner.nextInt();
    while (userNumber <= 5) {
        System.out.print("Try again: ");
        userNumber = scanner.nextInt();
    }
    int count = 0;
    while (count < userNumber) {
        System.out.println(count);
        count ++;
    }
    System.out.println("and finally " + userNumber);
  }
}

