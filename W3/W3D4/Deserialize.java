/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package W3D4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author jambo
 */
public class Deserialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
       
        try {
            FileInputStream fin = new FileInputStream("Mycar.txt");
            ObjectInputStream oi = new ObjectInputStream(fin);
            Car myCar1 = (Car) oi.readObject();
            Car myCar2 = (Car) oi.readObject();
            Car myCar3 = (Car) oi.readObject();
            System.out.print(myCar1.getName());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
