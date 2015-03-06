/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Vehicle {

    private double x;
    private double y;
    private double direction;

    public Vehicle() { //everything is zero here 

        System.out.println("Nothiing");

    }

    public Vehicle(double x, double y) {  //speed and direction are zero here
        this.x = x;
        this.y = y;

    }

    public Vehicle(double x, double y, double direction) {  // speed is zero here
        System.out.println("x, y, and direction initializing here ....");
        this.x = x;
        this.y = y;
        this.direction-= 360.0;
    }
//Getter and Setter

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = 135;
    }
}
