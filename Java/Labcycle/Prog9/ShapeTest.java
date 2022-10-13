import java.util.Scanner;

class ShapeTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        String nl = System.lineSeparator();
        shape s1 = new Rectangle();
        System.out.println("Choose the Shape:" + nl + "1.Circle" + nl + "2.Rectangle" + nl + "3.Triangle");
        int choice = s.nextInt();
        switch (choice) {
            case 1:
                Circle c = new Circle();
                System.out.println("Enter th radius of circle");
                int r = s.nextInt();
                a = c.area(r, r);
                System.out.println("Area of circle is:" + a);
                break;
            case 2:
                Rectangle r1 = new Rectangle();
                System.out.println("Enter Length ");
                int l = s.nextInt();
                System.out.println("Enter Breadth ");
                int b = s.nextInt();
                a = r1.area(l, b);
                System.out.println("Area of Rectancle is:" + a);
                break;
            case 3:
                Triangle t = new Triangle();
                System.out.println("Enter Height ");
                int h = s.nextInt();
                System.out.println("Enter base ");
                int ba = s.nextInt();
                a = t.area(h, ba);
                System.out.println("Area of Triangle is:" + a);
                break;
            default:
                System.out.println("Wrong choice");
        }

    }

}
