/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class VehicleTestDriver {

    public static void main(String[] args) {
        CorporateCar obj = new CorporateCar(5.0, 2.3, 3.5, 5000, 200, 2015, "Jenber");
        System.out.println("The X Coodinate is: " + obj.getX());
        System.out.println("The Y Coordinate is: " + obj.getY());
        System.out.println( obj.getEmployee()+" The Employee for bookeeping");
        System.out.println("The Direction is " + obj.getDirection());
    }
}
