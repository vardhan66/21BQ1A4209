
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;

class Choicee extends Frame implements ActionListener {
    JButton b = new JButton("Submit");

    Choicee() {
        Panel p = new Panel();
        Choice c = new Choice();
        Label l = new Label("Select Branch:");
        p.setLayout(new BoxLayout(p, 1));
        c.add("Select");
        c.add("CSE");
        c.add("CSM");
        c.add("AIML");
        c.add("CSO");
        c.add("CIC");
        c.add("AID");
        c.add("IT");
        p.add(l);
        p.add(c);
        this.add(p);
        this.b.addActionListener(this::actionPerformed);
        p.add(this.b);
        this.addWindowListener(new WindowAdapter(this) {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        Choicee c = new Choicee();
        c.setSize(400, 200);
        c.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        this.b.updateUI();
    }
}
