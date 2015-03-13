/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author jambo
 */
public class CarTesterDriver {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        Car myCar3 = new Car();
        myCar1.setName("Honda");
        myCar2.setName("Toyota");
        myCar3.setName("MBW");
        myCar1.setColor("Red");
        myCar2.setColor("White");
        myCar3.setColor("Blue");
        FileOutputStream fout = new FileOutputStream("Mycar.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(myCar1);
        out.writeObject(myCar2);
        out.writeObject(myCar3);
        out.close();


    }
}
