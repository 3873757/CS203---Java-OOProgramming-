/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author jambo
 */
public class GarageTestDriver {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Truck myTruck = new Truck();
        Item first = new Item("first");
        Item second = new Item("Second");
        Item third = new Item();
        Guarage obj = new Guarage();
        obj.store(myCar);
        System.out.println(obj.retrieve().getModel());
        obj.store(myTruck);
        obj.store(first);
        obj.store(second);
        System.out.println(obj.retrieve(0).getName());
        System.out.println(obj.retrieve(1).getName());

    }
}
