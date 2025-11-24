package U2T5P2;

public class Problem2 {
    public static void main(String[] args) {
        int dice1 = 0;
        int dice2 = 0;
        int count = 1;
        while (!(dice1 == 1 && dice2 == 1)) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("Roll #" + count + ": " + dice1 + " and " + dice2);
            if (dice1 == 1 && dice2 == 1) {
                System.out.println("Finally, snake eyes!");
            } else {
                System.out.println("Not snake eyes, rolling again!");
            }
            count ++;
        }
    }
}
