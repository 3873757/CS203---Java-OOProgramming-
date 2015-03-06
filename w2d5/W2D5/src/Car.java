/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Car extends Automobile {

    private boolean convertible;
    private int truckcapacity;

    public Car() {
        super();
    }

    public Car(String make, String model, int year, String color, boolean convertible, int trunkCapacity) {
        this.convertible = false;
        this.truckcapacity = truckcapacity;
    }

    public Car(String make, String model, int year, String color, int trunkCapacity) {
        this.convertible = false;
        this.truckcapacity = truckcapacity;
    }

    public Car(String make, String model, int trunkCapacity) {
        this.truckcapacity = truckcapacity;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getTruckcapacity() {
        return truckcapacity;
    }

    public void setTruckcapacity(int truckcapacity) {
        this.truckcapacity = truckcapacity;
    }
}