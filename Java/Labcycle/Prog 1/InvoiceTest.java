//class to test Invoice
import java.util.Scanner;//importing scanner for runtime input
class InvoiceTest
{
     public static void main(String Var[]) {//starting of the main method
        Scanner s = new Scanner(System.in);//creating scanner object
          
        System.out.println("Enter Part Number:");//partnumber prompt
        String pno=s.nextLine();//reads the input and cursor goes to next line
          
        System.out.println("Enter Part Description:");//PROMPT TO Enter part description
        String pdes=s.nextLine();//reads the String input and the cursor goes to nextline
          
        System.out.println("Enter Quantitiy:");//prompt to enter quantity
        int q = s.nextInt();//reads the integer input
          
        System.out.println("Enter Price:");//prompt to enter the price 
        double p=s.nextDouble();//reads the price input
          
        //Creating an object of Invoice class
        Invoice o = new Invoice(pno, pdes, q, p);
        double total=o.getInvoiceAmount();//assigning the caluculated amount to total
          
          
        //To display the details:
        System.out.println("Part Number:"+o.getPartNum());
        System.out.println("Part Description:"+o.getPartDeS());
        System.out.println("Quantitiy:"+o.getQuan());
        System.out.println("Price per item :"+o.getPrice());
        System.out.println("Total Price is "+total);
        
    }//end of main medthod
}//end of class
