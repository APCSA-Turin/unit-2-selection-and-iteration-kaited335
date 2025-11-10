import java.util.Scanner;

public class Runner {
   public static void main(String[] args) {
    final int VOTING_AGE = 18;
   final int DRIVING_AGE = 16;
   int myAge = 17;

   boolean canVote = (myAge >= VOTING_AGE);
   boolean canDrive = (myAge >= DRIVING_AGE);
   System.out.println("I can vote: " + canVote);
   System.out.println("I can drive: " + canDrive);
    
   int yourAge = 18;
   boolean sameAge = myAge == yourAge;
   if (sameAge) {
      System.out.println("Same age");
   } else {
      System.out.println("Different age");
   }

   int num1 = 12;
   boolean isEven = false;
   if (num1 % 2 == 0) {
      isEven = true;
   }
   System.out.println(num1 + " is even: " + isEven);

   boolean weird = (num1 <= 15) != (yourAge > 20);
   System.out.println(weird);

   String n = "hi";
   if (n.equals("bye")) {
      n = "whatever";
   } else if (n.equals("hello")) {
      n = "however";
   }
   System.out.println(n);

   }
}
