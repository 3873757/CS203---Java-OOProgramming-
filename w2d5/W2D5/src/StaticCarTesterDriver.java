/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class StaticCarTesterDriver {
    public static void main (String[] args){
        StaiticCarsStatics StaCars = new StaiticCarsStatics("Toyota", "Camry",2004,  "Red");
         StaCars.model="white";       
        System.out.println(StaCars.getMake());        
        System.out.println(StaCars.getYear());
        System.out.println(StaCars.getColor());
    }
}
