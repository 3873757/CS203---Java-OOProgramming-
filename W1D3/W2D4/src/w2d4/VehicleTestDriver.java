/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4;

/**
 *
 * @author jambo
 */
import java.util.ArrayList;

public class VehicleTestDriver {

    public static void main(String[] args) {
        ArrayList<Vehicle> Vehicle = new ArrayList<>();
        ArrayList<Asset> Asset = new ArrayList<>();
        ArrayList<Object> Object = new ArrayList<>();
        CorporatCar myCorpcar = new CorporatCar();
        Vehicle.add(myCorpcar);
        Asset.add(myCorpcar);
        Object.add(myCorpcar);
        myCorpcar.setSpeed(30);
        myCorpcar.setYearPurchsed(1998);
        myCorpcar.turn(45);
        myCorpcar.setPurchaseprice(6543.2345);
        myCorpcar.setCurrentValue(3421.45);
        System.out.println(myCorpcar.accelerate());
        System.out.println(myCorpcar.brake());
        System.out.println(myCorpcar.getcurrentValue());
        System.out.println(myCorpcar.getpurchaseprice());
    }
}
