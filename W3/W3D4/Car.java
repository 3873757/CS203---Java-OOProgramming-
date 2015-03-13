/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D4;

import java.io.Serializable;

/**
 *
 * @author jambo
 */
public class Car implements Serializable {

    private static final long serialVersionUID = 125L;
    private int x = 0;
    private int y = 0;
    private String color;
    private double price;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moveUp() {

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
