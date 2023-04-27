import java.util.Scanner;

class Testemp {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                Employe p = new Programmer();
                System.out.println("Enter the Basic pay of Programmer:");
                double bp = s.nextDouble();
                //// Employe e = new Employe();
                double g = p.gross(bp);
                double n = p.net();
                System.out.println("----Programmer----");
                p.display();
                System.out.println("Gross salary" + g);
                System.out.println("Net salary" + n);
                System.out.println("    -------");
            }
            if (i == 1) {
                Employe ap = new AssistantProfessor();
                System.out.println("Enter the Basic pay of Assistant Professor:");
                double bp = s.nextDouble();
                double g = ap.gross(bp);
                double n = ap.net();
                System.out.println("----AssistantProfessor----");
                ap.display();
                System.out.println("Gross salary" + g);
                System.out.println("Net salary" + n);
                System.out.println("    -------");
            }
            if (i == 2) {
                Employe asp = new AssociateProfessor();
                System.out.println("Enter the Basic pay of Associate Professor:");
                double bp = s.nextDouble();
                // Employe e = new Employe();
                System.out.println("----AssociateProfessor----");
                double g = asp.gross(bp);
                double n = asp.net();
                asp.display();
                System.out.println("Gross salary" + g);
                System.out.println("Net salary" + n);
                System.out.println("    -------");
            }
            if (i == 3) {
                Employe pf = new Professor();
                System.out.println("Enter the Basic pay of Professor:");
                double bp = s.nextDouble();
                double g = pf.gross(bp);
                double n = pf.net();
                System.out.println("----Professor----");
                pf.display();
                System.out.println("Gross salary" + g);
                System.out.println("Net salary" + n);
                System.out.println("    -------");
            }
        }
    }
}
