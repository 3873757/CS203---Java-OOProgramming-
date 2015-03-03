/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2;

/**
 *
 * @author jambo
 */
public class CarTestDriver {    
    public static void main(String[] args){
        Car.moveDown(3);
        Car.moveLeft(3);
        Car.moveRight(4);
        Car.moveUp(4);
        System.out.println(Car.returnLocation());
    }
    
}
