/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

public class Car {

    private int x = 0;
    private int y = 0;

    public Car() {
    }

    public Car(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {  //public int moveUp()
        //return y+1
        y += 1;
    }

    public void moveDown() {
        y -= 1;
    }

    public void moveRight() {
        x += 1;
    }

    public void moveLeft() {
        x -= 1;
    }

    public void printLocation() {
        System.out.println("(" + x + "," + y + ")");
    }
}
