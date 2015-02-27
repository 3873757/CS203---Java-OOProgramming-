/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author jambo
 */
public class CarTesterDriver {

    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        myCar1.moveRight(5);
        myCar2.moveRight(6);
        myCar1.moveUp(10);
        myCar2.moveUp(10);
        myCar1.returnLocation();
        myCar2.returnLocation();
        System.out.println(myCar1.returnLocation());
        System.out.println(myCar2.returnLocation());

    }
}
