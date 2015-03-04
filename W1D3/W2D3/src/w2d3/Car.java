/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author jambo
 */
public class Car extends Automobile {

    private boolean convertible;
    private int truckcapacity;

    public int getTruckcapacity() {
        return truckcapacity;
    }

    public void setTruckcapacity(int truckcapacity) {
        this.truckcapacity = truckcapacity;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    Car() {             //constructor
    }

    Car(String model) {
        super(model);
    }

    @Override
    public int accelerate() {
        return speed += 12;
    }

    @Override
    public int brak() {

        return speed -= 10;
    }
}
