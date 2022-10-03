//
class SavingsAccount
{
    //static variable to store the annual interest rate
    static double $annual_intrest_$rate;
    //private  instance variable
    private double $sbalence;

    SavingsAccount(double b)//costructor taking blence as a parameter
    {
      $sbalence=b;//assigning savers balence to instance variable
    }

    double cal_Monthlyintrest()//method to caluculate monthly intrest
      {
        $sbalence+=($sbalence*$annual_intrest_$rate)/12;
        return $sbalence;
      }  
    
    //static method to modify annual intrest rate
    static void modify_annual_IR(double a)
    {
        $annual_intrest_$rate=a;
    }
    }          
