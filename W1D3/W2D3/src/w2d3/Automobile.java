/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/*
 * @author jambo
 */
public class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    protected int speed = 0;

    Automobile() {
    }

    Automobile(String model) {
        this.model = model;
    }

    public void move() {
        System.out.println("move!! move!! move!!");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String name) {
        this.make = name;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
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

    public void setYear(int year) {
        this.year = year;
    }
}
