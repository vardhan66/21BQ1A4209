//To demonstrate Assertion with an example
//importing Scanner from util package
import java.util.Scanner;

class AssertionExample {
    public static void main(String args[]) {//main method

        Scanner scanner = new Scanner(System.in);//creating scanner object
        //prompt
        System.out.print("Enter ur age ");
        //reading input
        int value = scanner.nextInt();
        assert value >= 18 : " Not valid";//assertion

        System.out.println("value is " + value);//displaying value
        scanner.close();
    }//end of main method
}//end of class
