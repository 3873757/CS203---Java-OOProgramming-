/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jambo
 */
public class AnimationBall {

    private JFrame frame;
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        AnimationBall anim = new AnimationBall();
        anim.go();
    }
    private int EXIT_ON_CLOSE;
    private boolean up;
    private boolean down;
    private boolean right;
    private boolean left;

    public void go() {
       
        frame = new JFrame("Moving ball");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyKeyListener myls = new MyKeyListener();
        frame.addKeyListener(myls);
        DrawPanel d = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, d);

        frame.setSize(300, 300);
        frame.setVisible(true);
       
         while(true){
             if (up) {
                 y -= 1;
             } else if (down) {
                 y += 1;
             }
             if (left) {
                 x -= 1;
             } else if (right) {
                 x += 1;
             }
             try {
                Thread.sleep(1000/60);
                frame.repaint();
            } catch (Exception e) {
            }
         
         //the second while loop***************
        //while(true){
             if (y==0) {
                 up= false;
             } else if (y==240) {
                 down=false;
             }
             if (x==0) {
                 left = false;
             } else if (x==260) {
                 right=false;
             }
            
    }
    } 
  
    public   class MyKeyListener implements KeyListener{

        @Override
        public void keyPressed(KeyEvent ke) {


            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = true;
                
            }

            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = true;
                
            }

            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = true;
                
            }

            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = true;
               
            }
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            if (ke.getKeyCode() == KeyEvent.VK_UP) {
                up = false;
            }

            if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
                down = false;
            }

            if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
                left = false;
            }

            if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
                right = false;
            }
        }

        @Override
        public void keyTyped(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    public class DrawPanel extends JPanel {
       
        @Override
        public void paintComponent(Graphics g) {
            //g.setColor(Color.black);
            //g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.blue);
            g.fillOval(x, y, 25, 25);
        }
    }

}