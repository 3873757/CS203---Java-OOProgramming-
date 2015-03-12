
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator implements ActionListener {
    
    private double firstNumber;
    private double secondNumber;
    private double result;
    private int operation;
    private String str = "";   //avoid null val
    private JTextArea display;
    private Button button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12, button13, button14, button15, button16, button0;
    
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.go();
    }

    private void go() {
        
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        
        display = new JTextArea(3, 18);
        panel.add(display);
        JButton button1 = new JButton("2");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "2";
                display.setText(str);
            }
        });
        
        JButton button2 = new JButton("3");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "3";
                display.setText(str);
            }
        });
        JButton button3 = new JButton("*");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "*";
                display.setText(str);
            }
        });
        JButton button4 = new JButton(".");
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += ".";
                display.setText(str);
            }
        });
        JButton button5 = new JButton("0");
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "0";
                display.setText(str);
            }
        });
        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "7";
                display.setText(str);
            }
        });
        JButton button8 = new JButton("/");
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "/";
                display.setText(str);
            }
        });
        JButton button9 = new JButton("8");
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "8";
                display.setText(str);
            }
        });
        JButton button10 = new JButton("9");
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "9";
                display.setText(str);
            }
        });
        JButton button11 = new JButton("+");
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "+";
                display.setText(str);
            }
        });
        JButton button12 = new JButton("4");
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "4";
                display.setText(str);
            }
        });
        JButton button13 = new JButton("5");
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "5";
                display.setText(str);
            }
        });
        JButton button14 = new JButton("6");
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "6";
                display.setText(str);
            }
        });
        JButton button15 = new JButton("-");
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "-";
                display.setText(str);
            }
        });
        JButton button16 = new JButton("1");
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "1";
                display.setText(str);
            }
        });
        JButton button0 = new JButton("c");
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                str += "";
                display.setText("");
            }
        });
      
        JButton button6 = new JButton("=");
        button6.addActionListener(new ActionListener() {
            private String str;

            @Override
            public void actionPerformed(ActionEvent ae) {
                String result = display.getText();
                String[] splitArray = result.split("");
                for (String item : splitArray) {
                    System.out.println(item);
                }
                String operator = splitArray[1];
                switch (operator) {
                    case "+":
                        add(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    case "-":
                        substract(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    case "/":
                        division(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    case "*":
                        multiply(Integer.parseInt(splitArray[0]), Integer.parseInt(splitArray[2]));
                        break;
                    default:
                        System.out.println("GUI is fun !!!");
                        break;
                }                
                
                                
            }            
            
            private void add(int a, int b) {
                int sum = a + b;
                this.str = "" + sum;
                display.setText(str);
            }
            
            private void multiply(int a, int b) {
                int result = a * b;
                this.str = "" + result;
                display.setText(str);
            }
            
            public void division(int a, int b) {
                int result = a / b;
                this.str = "" + result;
                display.setText(str);
            }
            
            private void substract(int a, int b) {
                int result = a - b;
                this.str = "" + result;
                display.setText(str);
            }
            //display.setText(str);
        });
               
        frame.getContentPane().add(BorderLayout.SOUTH, panel1);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        panel1.setPreferredSize(new Dimension(225, 250));        
        panel.add(button0);
        panel1.add(button7);
        panel1.add(button9);
        panel1.add(button10);
        panel1.add(button11);
        panel1.add(button12);
        panel1.add(button13);
        panel1.add(button14);
        panel1.add(button15);
        panel1.add(button16);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button8);
        
        
        button0.setPreferredSize(new Dimension(45, 45));        
        button1.setPreferredSize(new Dimension(55, 55));
        button2.setPreferredSize(new Dimension(55, 55));
        button3.setPreferredSize(new Dimension(55, 55));
        button4.setPreferredSize(new Dimension(55, 55));
        button5.setPreferredSize(new Dimension(55, 55));
        button6.setPreferredSize(new Dimension(55, 55));
        button7.setPreferredSize(new Dimension(55, 55));
        button8.setPreferredSize(new Dimension(55, 55));
        button9.setPreferredSize(new Dimension(55, 55));
        button10.setPreferredSize(new Dimension(55, 55));
        button11.setPreferredSize(new Dimension(55, 55));
        button12.setPreferredSize(new Dimension(55, 55));
        button13.setPreferredSize(new Dimension(55, 55));
        button14.setPreferredSize(new Dimension(55, 55));
        button15.setPreferredSize(new Dimension(55, 55));
        button16.setPreferredSize(new Dimension(55, 55));        
        frame.setSize(275, 350);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {        
    }
}
