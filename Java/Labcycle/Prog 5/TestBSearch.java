//importing Scanner class
import java.util.*;
//creating a class to test binary search
public class TestBSearch {
    public static void main(String[] args) {//main method
        //creating an object of scanner class
        Scanner s= new Scanner(System.in);
        //prompt for size of the array
        System.out.println("Enter the size of an array:");
        int sz =s.nextInt();
        int[] m=new int[sz];//creating array of size provided by user
        //prompt to enter elements
        System.out.println("Enter elements of the array in sorted order:");
        for (int i=0;i<sz;i++)
        {
            m[i] =s.nextInt();//storing elements in array
        }
        System.out.println("Enter the Desired element:");
        int k=s.nextInt();//key value is assigned to k
        //object creation
        Binarysearch b=new Binarysearch();
        int c=b.bSearch(m, k, sz);
        if (c==0) System.out.println("Element is not found");
        else
        System.out.println("Element is found at"+c);//Displying the position of element
    }//end of main method
}//end of class
