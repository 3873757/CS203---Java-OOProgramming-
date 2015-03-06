/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class AutomobilTesterDriver {

    public static void main(String[] args) {
        Car myCar = new Car("toyota", "Camry", 2003, "Red", 5432);
        Truck myTruck = new Truck("Ford", "X5", 2010, "Blue", 5643, false);

        Automobile Auto = new Automobile("Toyota", "Lexus", 2004, "Red");
        System.out.println(myTruck.getColor()+" "+myTruck.getModel()+" "+myTruck.getYear()+" "+myTruck.getMake());
        System.out.println(Auto.getModel() + " " + Auto.getMake() + " " + Auto.getYear());


    }
}
