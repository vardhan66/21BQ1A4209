//In this class there are two methods to caluculate the Electricity bill
class ElectricityBill
{
			//Domestic type caluculation method which returns rupees in double
			double domestic(double a)//takes one parameter in units
			{
		 		if (a<=100)//checks the condition
					return a*1;
		 		else if (a<=200)
					return 100+(a-100)*2.50;
		 		else if (a<=500)
					return 100+250+(a-200)*4;
		 		else
					return 100+250+800+(a-500)*6;
			}//end of domestic method
			//Commercial type caluculation method which returns rupees in double
			double commercial(double a)
			{
		 		if (a<=100)
					return a*2;
		 		else if (a<=200)
					return 200+(a-100)*4.50;
				else if (a<=500)
					return 200+900+(a-200)*6;
		 		else //if the all above conditions are not true then else part is executed
					return 200+900+1800+(a-500)*7;
			}//end of commercial method
}//end of class
