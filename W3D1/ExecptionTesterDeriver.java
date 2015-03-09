/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jambo
 */
public class ExecptionTesterDeriver {

    public static void main(String[] args) {
        try {
            //try{
            doThingA();
            doThingB();
            //}catch (Exception e){
            //System.out.println("Some Exceptions Occured");
            //}
        } catch (MyException ex) {
            System.out.println("this is my catch");
        }
    }

    public static void doThingA()  {
        try {
            doThingB();
        } catch (MyException ex) {
            System.out.print("catch doing b");
        }finally{
            System.out.println("finally we are doing it");
        }
    
    }

    public static void doThingB() throws MyException {
        doThingC();
    }
      
    public static void doThingC() throws MyException {
        doThingD();
    }

    public static void doThingD() throws MyException {
        throw new MyException("new a message");
    }
}
