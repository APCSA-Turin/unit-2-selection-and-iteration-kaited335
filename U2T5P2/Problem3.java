package U2T5P2;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to halve to one? ");
        int userNumber = scanner.nextInt();
        int original = userNumber;
        int count = 0;
        while (userNumber > 1) {
            userNumber /= 2;
            System.out.println(userNumber);
            count ++;
        }
        System.out.println("It takes " + count + " halvings to get from " + original + " to 1.");
  }
}
