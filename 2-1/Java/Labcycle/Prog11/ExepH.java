import java.util.InputMismatchException;
import java.util.Scanner;

class test {
    Scanner s = new Scanner(System.in);

    void mismatch() {
        System.out.println("Enter any integer value:");
        int m = s.nextInt();
        System.out.println("Value is " + m);
    }

    void divide() {
        System.out.println("Enter numerator:");
        int numerator = s.nextInt();
        System.out.println("Enter Denominator");
        int Denominator = s.nextInt();
        double r = numerator / Denominator;
        System.out.println("Result is" + r);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            new test().mismatch();

        } catch (InputMismatchException e) {
            System.err.println("Input Mismatch \nEnter correct input:");
            String n = s.next();
            System.out.println(" " + n);
        }
        {
            try {
                new test().divide();
            }

            catch (ArithmeticException e1) {
                System.out.println(e1 + "\n Error Enter correct Denominator");
                new test().divide();
            } finally {
                System.out.println("...");
            }
        }
    }
}
