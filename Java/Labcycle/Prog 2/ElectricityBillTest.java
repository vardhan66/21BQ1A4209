import java.util.Scanner;//Scanner class is imported to take the manual input.
class ElectricitybillTest
{
	public static void main(String args[])
	{
		int t;//variable of type integer
		String cno,cname;//variables of type String
		double nu,b,b1,pmr,cmr;// variables defined of type double 
		Scanner s =new Scanner(System.in);//object s is created from Scanner class
		
		System.out.println("Enter consumer number");
		cno=s.nextLine();//input is stored in cno
		
		System.out.println("Enter consumer name");
		cname=s.nextLine();//input is stoired in cname
		
		System.out.println("Enter previous month reading:");
		pmr=s.nextDouble();//input is stored in pmr
		
		System.out.println("Enter current month reading:");
		cmr=s.nextDouble();//input is stored in cmr
		
		//condition to finialize the number of units
		if (pmr>cmr)
			nu=cmr;
		else
			nu=cmr-pmr;
		
		//choosing the type of EB connection
		System.out.println("Choose your EB type \n 1.Domestic \n 2.Commercial");//prompt to choose the connection type
		t=s.nextInt();//choice of the user is assignerd to t
		
		//object creation of class ElectricityBill
		ElectricityBill e=new ElectricityBill();
		b=e.domestic(nu);//passed parameter is stored in the variable
		b1=e.commercial(nu);//passed parameter is stored in variable
		
		//To display the generated electricity bill with details
		System.out.println("Consumer number"+cno);// prints the consumer number
		System.out.println("Consumer name"+cname);//prints the consumer name
		if (t==1)
			System.out.println("Electricity Bill is Rs."+b);//Bill is displayed for domestic type
		
		else if(t==2)
			System.out.println("Electricity Bill is Rs."+b1);//Bill is displayed for commercial type
	
	}//end of main method
}//end of class
