import java.util.Scanner;

class Employe {
    static String Emp_name, Emp_id, address, mail_id;
    static int m_num;
    double basicpay, gs, ns, g, n;

    Employe() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee name:");
        Emp_name = s.nextLine();
        System.out.println("Enter Employee Id:");
        Emp_id = s.nextLine();
        System.out.println("Enter Addresss:");
        address = s.nextLine();
        System.out.println("Enter Mail ID:");
        mail_id = s.nextLine();
        System.out.println("Enter Moblie Number:");
        m_num = s.nextInt();

    }

    double gross(double basicpay) {
        double DA = 0.97 * basicpay;
        double HRA = 0.1 * basicpay;
        gs = basicpay + DA + HRA;
        return gs;
    }

    double net() {
        double pf = 0.12 * basicpay;
        double s_c_fund = 0.001 * basicpay;
        ns = gs - pf - s_c_fund;
        return ns;
    }

    void display() {
        System.out.println("Name:" + Emp_name);
        System.out.println("Employee id:" + Emp_id);
        System.out.println("Address:" + address);
        System.out.println("Mail Id:" + mail_id);
        System.out.println("Mobile number:" + m_num);
    }
}

class Programmer extends Employe {
    double basicpay;

    Programmer() {
        super();

    }

}

class AssistantProfessor extends Employe {
    double basicpay;

    AssistantProfessor() {
        super();

    }
}

class AssociateProfessor extends Employe {
    double basicpay;

    AssociateProfessor() {
        super();

    }
}

class Professor extends Employe {
    double basicpay;

    Professor() {
        super();

    }
}
