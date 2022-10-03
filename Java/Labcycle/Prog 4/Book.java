

class Book 
{
private String Name;
private String ISBN;
private String Author;
private String Publisher;


 Book(String name, String isbn, String author, String publisher)
 {
Name = name;
ISBN = isbn;
Author = author;
Publisher = publisher;
}

public void setName(String Name) 
{
this.Name = Name;
}
public String getName()
 {
return Name;
}
public void setISBN(String ISBN) 
{
this.ISBN = ISBN;
}
public String  getISBN() 
{
return ISBN;
}

public void setAuthor(String Author) 
{
this.Author = Author;
}
public String get
Author() 
{
return Author;
}
public void setPublisher(String Publisher) 
{
this.Publisher = Publisher;
}
public String getPublisher() 
{
return Publisher;
}
String getBookInfo()//Method used to display details
 {
        return "Name :" +Name+ " "+ "Isbn: "+ISBN+" "+"Author: "+Author+" "+"Publisher: "+Publisher;
 }}