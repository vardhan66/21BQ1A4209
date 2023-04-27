
//importing math class from lang package in java library
import java.lang.Math;

//creating class named Dice
class Dice {
  public static void main(String[] args) {// main method start
    int[] a = new int[7];// creating an array object of type int
    // Iterating loop 10,000 times and rolling a pair of dice for each iteration
    for (int i = 1; i <= 10000; i++) {
      // using random method from math class
      int n = (int) (1 + Math.random() * 6);// int n =(int)(Lowerbound
      // +math.random() upperbound)
      int m = (int) (1 + Math.random() * 6);
      // checking condition for equal sides of dice
      if ((m == n)) {
        a[m]++;// incrementing the count of m-th element based on the pair of double
        // rolled in array
      }
    }
    for (int k = 1; k < a.length; k++) {// loop for displaying
      System.out.println("Number of  " + k + "," + k + " that have occured : " +
          a[k]);

    }
  }
}
