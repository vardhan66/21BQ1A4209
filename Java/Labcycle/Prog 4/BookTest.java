import java.util.*;
class BookTest {
        public static void main(String[] args) {
           
    Book[] b = new Book[30];
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Book name:");
    String name=s.nextLine();
    System.out.println("Enter ISBN:");
    String isbn =s.nextLine();
    System.out.println("Enter Author:");
    String auth =s.nextLine();
    System.out.println("Enter Publisher:");
    String publisher=s.nextLine();
    System.out.println();
    for (int i=0;i<1;i++)
    {
    b[i]=new Book(name, isbn, auth, publisher);
    System.out.println(b[i].getBookInfo());
    }

}
}

