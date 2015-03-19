package gameoflife;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *********** @author jambo **********
 */
public class GameOfLife extends JFrame implements ActionListener {

    private static int BLOCK_SIZE = 25;
    private static final long serialVersionUID = 38737L;
    private JMenuBar mb_menu;
    private JMenu m_game;
    private JMenuItem mi_play, mi_stop, mi_reset;
    private GameBoard Board;
    private Thread game;

    public static void main(String[] args) {
        // Setup the Game  specifics
        JFrame frame = new GameOfLife();
        frame.setTitle("CS203 Final Project Game of Life");
        frame.setSize(650, 500);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
//constructors

    public GameOfLife() {
        // Setup menu
        mb_menu = new JMenuBar();
        setJMenuBar(mb_menu);
        m_game = new JMenu("Game");
        mb_menu.add(m_game);
        mi_play = new JMenuItem("Play");
        mi_play.addActionListener(this);
        mi_stop = new JMenuItem("Stop");
        mi_stop.setEnabled(false);
        mi_stop.addActionListener(this);
        mi_reset = new JMenuItem("Reset");
        mi_reset.addActionListener(this);
        m_game.add(mi_play);
        m_game.add(mi_stop);
        m_game.add(mi_reset);
        Board = new GameBoard();
        add(Board);
    }

    public void setGameBeingPlayed(boolean isBeingPlayed) {
        if (isBeingPlayed) {
            mi_play.setEnabled(false);  //unplayed mood
            mi_stop.setEnabled(true);
            game = new Thread(Board);
            game.start();
        } else {
            mi_play.setEnabled(true);
            mi_stop.setEnabled(false);
            game.interrupt();//sops the game when stop is clicked
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(mi_reset)) {
            Board.resetBoard();
            Board.repaint();
        } else if (ae.getSource().equals(mi_play)) {
            setGameBeingPlayed(true);
        } else if (ae.getSource().equals(mi_stop)) {
            setGameBeingPlayed(false);
        }
    }
    //@SuppressWarnings("serial")
    //Anonempus class

    private class GameBoard extends JPanel implements ComponentListener, MouseListener, MouseMotionListener, Runnable {

        private Dimension gameBoardSize = null;
        private ArrayList<Point> point = new ArrayList<>();

        public GameBoard() {
            // Add resizing listener
            addComponentListener(this);
            addMouseListener(this);
            addMouseMotionListener(this);
        }
        private void updateArraySize() {
            ArrayList<Point> removeList = new ArrayList<>(0);
            for (Point current : point) {
                if ((current.x > gameBoardSize.width) || (current.y > gameBoardSize.height)) {
                    removeList.add(current);
                }
            }
            point.removeAll(removeList);
            repaint();
        }

        public void addPoint(int x, int y) {
            if (!point.contains(new Point(x, y))) {
                point.add(new Point(x, y));
            }
            repaint();
        }
        public void addPoint(MouseEvent e) {
            int x = Math.min((e.getPoint().x / 25-1), 23);
            int y = Math.min(e.getPoint().y / 25-1, 15);    //min and max
            if ((x >= 0) && (x < gameBoardSize.width) && (y >= 0) && (y < gameBoardSize.height)) {
                addPoint(x, y);
            }
        }

        public void resetBoard() {
            point.clear();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            try {
                for (Point newPoint : point) {
                    // Draw new point
                    g.setColor(Color.GREEN);
                    g.fillRect(BLOCK_SIZE + (BLOCK_SIZE * newPoint.x), BLOCK_SIZE + (BLOCK_SIZE * newPoint.y), BLOCK_SIZE, BLOCK_SIZE);
                }
            } catch (ConcurrentModificationException cme) {
            }
        }

        @Override
        public void componentResized(ComponentEvent e) {
            gameBoardSize = new Dimension(getWidth() / BLOCK_SIZE, getHeight() / BLOCK_SIZE);
            updateArraySize();
        }

        @Override
        public void componentMoved(ComponentEvent e) {
            //JAva is cool
        }

        @Override
        public void componentShown(ComponentEvent e) {
            //not needed
        }

        @Override
        public void componentHidden(ComponentEvent e) {
            //i love MUM
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            //CS203 Final project has done
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //GUI killed me
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // Mouse was released (user clicked)
            addPoint(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // I have Stacked on Stack
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //polymorphism is fun
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            addPoint(e);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            //Mouse is moved
        }
        @Override
        public void run() {
            boolean[][] Board = new boolean[gameBoardSize.width][gameBoardSize.height];
            for (Point current : point) {
                Board[current.x + 1][current.y + 1] = true;
            }
            ArrayList<Point> survivingCells = new ArrayList<>();
            // Iterate through the array, follow game of life rules
            for (int i = 1; i < Board.length - 1; i++) {
                for (int j = 1; j < Board[0].length - 1; j++) {
                    int nighbor = 0;
                    if (Board[i - 1][j - 1]) {
                        nighbor++;
                    }
                    if (Board[i - 1][j]) {
                        nighbor++;
                    }
                    if (Board[i - 1][j + 1]) {
                        nighbor++;
                    }
                    if (Board[i][j - 1]) {
                        nighbor++;
                    }
                    if (Board[i][j + 1]) {
                        nighbor++;
                    }
                    if (Board[i + 1][j - 1]) {
                        nighbor++;
                    }
                    if (Board[i + 1][j]) {
                        nighbor++;
                    }
                    if (Board[i + 1][j + 1]) {
                        nighbor++;
                    }
                    if (Board[i][j]) {
                        if ((nighbor == 2) || (nighbor == 3)) {
                            survivingCells.add(new Point(i - 1, j - 1));
                        }
                    } else {
                        // Cell is dead, will the cell be given birth? (3)
                        if (nighbor == 3) {
                            survivingCells.add(new Point(i - 1, j - 1));
                        }
                    }
                }
            }
            resetBoard();    //once cell dead it should back to unplayed cell
            point.addAll(survivingCells);
            repaint();
            try {
                Thread.sleep(500);
                run();
            } catch (InterruptedException ex) {
            }
        }
    }
}
