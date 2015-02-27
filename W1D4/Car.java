/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author jambo
 */
public class Car {

    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }

    public void setX(int a) {
        this.x = a;
    }

    public int getY() {
        return y;
    }

    public void setY(int b) {
        this.y = b;
    }

    public void moveUp(int b) {
        y += b;
    }

    public void moveDown(int b) {
        y -= b;

    }

    public void moveRight(int a) {
        x += a;

    }

    public void moveLeft(int a) {
        x -= a;
    }

    public String returnLocation() {
        return ("(" + x + "," + y + ")");

    }
}
