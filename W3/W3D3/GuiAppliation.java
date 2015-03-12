
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiAppliation implements ActionListener {

    private JFrame frame;
    private JButton button;
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;

    public static void main(String[] args) {

        GuiAppliation ga = new GuiAppliation();
        ga.go();
    }

    public void go() {

        JFrame frm = new JFrame("Jenber Nurye");
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JButton BtnA = new JButton("A");
        BtnA.addActionListener(this);
        JButton BtnB = new JButton("B");
        BtnB.addActionListener(this);
        JButton BtnC = new JButton("C");
        BtnC.addActionListener(this);
        JButton BtnD = new JButton("D");
        BtnD.addActionListener(this);
        frm.setSize(200, 210);
        frm.setVisible(true);
        panel1.add(BtnA);
        panel1.add(BtnB);
        panel.add(BtnC);
        panel.add(BtnD);
        frm.getContentPane().add(BorderLayout.NORTH, panel1);
        frm.getContentPane().add(BorderLayout.SOUTH, panel);
        panel1.setPreferredSize(new Dimension(180, 90));
        panel.setPreferredSize(new Dimension(180, 90));
        BtnA.setPreferredSize(new Dimension(75, 75));
        BtnB.setPreferredSize(new Dimension(75, 75));
        BtnC.setPreferredSize(new Dimension(75, 75));
        BtnD.setPreferredSize(new Dimension(75, 75));


        BtnA.addActionListener(new buttonA());
        BtnB.addActionListener(new buttonB());
        BtnC.addActionListener(new buttonC());
        BtnD.addActionListener(new buttonD());

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    private class buttonA implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Button A Pressed");
        }
    }

    class buttonB implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button B Pressed");
        }
    }

    class buttonC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button C Pressed");
        }
    }

    class buttonD implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button D Pressed");
        }
    }
}
