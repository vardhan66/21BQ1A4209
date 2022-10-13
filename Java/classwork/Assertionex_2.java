//To Demonstrate assertions using an example

//importing scanner class for manual input
import java.util.Scanner;

class AssertionExample2 {
    public static void main(String args[]) {// main method

        // Creating an object to scanner class
        Scanner scanner = new Scanner(System.in);
        // prompt
        System.out.print("Enter integer value: ");

        int value = scanner.nextInt();// reading input
        assert value % 2 == 0;// assertion
        assert value >= 0 : "Enter a positive value";// assertion

        System.out.println("Even value is:" + value);
        scanner.close();// scanner closed

    }// end of main method
}// end of class
