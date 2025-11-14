
public class SelectionMadness {

  // no instance variables //
  
  public SelectionMadness() { }

  /* Returns 1 of 5 randomly generated fortunes as a string;
     you should write your own 5 fortunes! (see output for examples)
   */
  public String fortune() {
     int random = (int) (Math.random() * 5) + 1;
     if (random == 1) {
      return "A pleasant surprise is waiting for you";
     } else if (random == 2) {
      return "Your hard work will soon pay off";
     } else if (random == 3) {
      return "The stars are in your favor";
     } else if (random == 4) {
      return "A little unlucky today be careful";
     } else {
      return "Everything will work out";
     } 
  }

  /* Returns the largest of three provided integers: num1, num2, or num3
   */
  public int largest(int num1, int num2, int num3) {
     int num = Math.max(num1,Math.max(num2,num3));
     return num;
  }
  public boolean rightTriangle(int side1, int side2, int side3) {
        boolean check;
    if ((Math.pow(side1,2) + Math.pow(side2,2)) == Math.pow(side3,2)) {
        check = true;
    } else if ((Math.pow(side3,2) + Math.pow(side2,2)) == Math.pow(side1,2)) {
        check = true;
    } else if ((Math.pow(side1,2) + Math.pow(side3,2)) == Math.pow(side2,2)) {
         check = true;
    } else {
      check = false;
    }
    return check;
  }


}
