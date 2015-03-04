/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author jambo
 */
import java.util.ArrayList;

public class AutomobileTestDrive {

    public static void main(String[] args) {
        ArrayList<Automobile> Auto = new ArrayList<>();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        c3.setMake("BMW");
        c3.setModel("X4");

        c1.setMake("Honda");
        c1.setModel("Accord");

        c2.setMake("Toyota");
        c2.setModel("camry");

        Auto.add(c1);
        Auto.add(c2);
        Auto.add(c3);

        Truck t1 = new Truck();
        t1.setMake("Ford");
        t1.setModel("Fx4");

        Truck t2 = new Truck();
        t2.setMake("Tacoma");
        t2.setModel("tundra");
        Auto.add(t1);
        Auto.add(t2);
        for (Automobile vehichel : Auto) {
            for (int i = 0; i < 3; i++) {
                vehichel.accelerate();
            }
        }
        System.out.println(c1.getMake() + " " + c1.getModel() + " " + c1.accelerate() + " " + c1.brak());
        System.out.println(c1.getMake() + " " + c2.getModel() + " " + c2.accelerate() + " " + c1.brak());
        System.out.println(c3.getMake() + " " + c3.getModel() + " " + c3.accelerate() + " " + c3.brak());
        System.out.println(t1.getMake() + " " + t1.getModel() + " " + t1.accelerate() + " " + t1.brak());
        System.out.println(t2.getMake() + " " + t2.getModel() + " " + t2.accelerate() + " " + t2.brak());

    }
}
