/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author jambo
 */
public class Truck extends Automobile {

    private int carryingcapacity;
    private boolean Hastailgate;

    Truck() {             //constructor
    }

    Truck(String model) {
        super(model);
    }

    @Override
    public int accelerate() {
        return speed += 7;
    }

    @Override
    public int brak() {
        return speed -= 10;
    }

    public int getCarryingcapacity() {
        return carryingcapacity;
    }

    public void setCarryingcapacity(int carryingcapacity) {
        this.carryingcapacity = carryingcapacity;
    }

    public boolean isHastailgate() {
        return Hastailgate;
    }

    public void setHastailgate(boolean Hastailgate) {
        this.Hastailgate = Hastailgate;
    }
}
