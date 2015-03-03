/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2;

/**
 *
 * @author jambo
 */
public class Car {
    private static int x = 0;
    private static int y = 0;

    public static int getX() {
        return x;
    }

    public static void setX(int a) {
        x += a;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int b) {
        y = b;
    }

    public static void moveUp(int b) {
        y += b;
    }

    public static void moveDown(int b) {
        y -= b;

    }

    public static void moveRight(int a) {
        x += a;

    }

    public static void moveLeft(int a) {
        x -= a;
    }

    public static String returnLocation() {
        return ("(" + x + "," + y + ")");

    }
}


