//Creating a class Invoice
class Invoice 
{
    //Creating the instance variables
    private String partnumber,partdescription;//variables of type String
    private int quantity;//variable of type int
    private double price;//variable of type double
    Invoice(String pno,String pdes,int q,double p)//constructor that takes four parameters
    {
        //Initialising instance variables
        partnumber=pno;
        partdescription=pdes;
        quantity=q;
        price=p;
    }
    void setPartNum(String pno)
    {
        partnumber=pno;//sets the passed String to the instance variable
    }
    void setPartDes(String pdes)
    {
        partdescription=pdes;//sets the passsed string to instance variable
    }
    void setQuan(int q)
    {
        quantity=q;//sets the passed quantity to instance variable
    }
    void setPrice(double p)
    {
        price=p;//sets the passed value to instance variable
    }
    String getPartNum()
    {
        return partnumber; //returns the String stored in instace variable
    }
    String getPartDeS()
    {
        return partdescription;//returns the String stored in instance variable
    }
    int getQuan()
    {
        return quantity;//returns the value stored in instance variable
    }
    double getPrice()
    {
        return price;//returns the value stored in instance variable
    }
    //method to caluculate amount
    double getInvoiceAmount()
    {
        if (quantity<0)//checks weather the quantitiy is positive or not
            quantity=0;
        if (price<0)//checks weather the price is positive or not
            price=0;
        return quantity*price;//returns the caluculated amount
    }
}


