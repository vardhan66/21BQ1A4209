class  SavingsAccTest
{
    public static void main(String args[])//Execution bgins here
    {
        //Creating an object saver1 and passing saver1's balence as a parameter
        SavingsAccount saver1 = new SavingsAccount(2000);

        //Creating an object saver2 and passing saver2's balence a parameter
        SavingsAccount saver2 = new SavingsAccount(3000);

        saver1.modify_annual_IR(4);//Modifying annual intrest rate of saver1 to 4 %
        saver2.modify_annual_IR(4);//Modifying annual intrest rate of saver2 to 4 %

        //To display the new balence of Savers for annual intrest rate 4%
        System.out.println("New Balence of user for interst 4 % is"+(float)saver1.cal_Monthlyintrest());
        System.out.println("New Balence  of user for interst 4 % is"+(float)saver2.cal_Monthlyintrest());

        saver1.modify_annual_IR(5);//Modifying annual intrest rate of saver1 to 5 %
        saver2.modify_annual_IR(5);//Modifying annual intrest rate of saver2 to 5 %

        //To display the new balence of savers for annual intrest rate 5 %
        System.out.println("New Balence of user for interst 5 % is"+(float)saver1.cal_Monthlyintrest());
        System.out.println("New Balence  of user for interst 5 % is"+(float)saver2.cal_Monthlyintrest());
    }
}