/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Automobile {

    protected String make;
    protected String model;
    protected String color;
    protected int year;
    protected int speed ;

    public Automobile() {
    }

    public Automobile(String make, String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.make = make;
        this.color = color;
    }

    public Automobile(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void move() {
        System.out.println("move!! move!! move!!");
    }

    public int accelerate() {
        return speed += 10;
    }

    public int brak() {

        return speed -= 10;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}