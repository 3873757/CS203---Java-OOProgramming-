/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jambo
 */
public class FirstGui {

    private JLabel jlbLabel1;
    private JFrame frame;
    private JButton labelButton;
    private JButton labelButton1;
    private JButton OKButton;

    public static void main(String[] args) {
        FirstGui fg = new FirstGui();
        fg.go();
    }
    private JLabel jlbLabel2;

    public void go() {
        frame = new JFrame("my first GUI!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        labelButton = new JButton("Helo");
        frame.getContentPane().add(BorderLayout.NORTH, labelButton);
        labelButton.setPreferredSize(new Dimension(150, 30));
        OKButton = new JButton(" Good Bye");
        OKButton.setPreferredSize(new Dimension(150, 30));
        frame.getContentPane().add(BorderLayout.SOUTH, OKButton);
        jlbLabel1 = new JLabel("Nothing yet");
        jlbLabel1.setHorizontalTextPosition(JLabel.CENTER);
        frame.add(jlbLabel1);
        labelButton.addActionListener(new LabelListener());
        frame.setVisible(true);
    }

    private static class LabelListener implements ActionListener {

        public LabelListener() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
