/*
 

 /**
 *
 * @author jambo
 */

public class Truck extends Automobile {

    private int carryingcapacity;
    private boolean Hastailgate;

    Truck() {
    }

    public Truck(String make, String model, int year, String color, int carryingCapacity,
            boolean hasTailGate){
             super(make, model, year,color);
        System.out.println("*******.....the remaining construtors are initialized below.............******");
        this.carryingcapacity = carryingcapacity;
        this.Hastailgate = false;
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
