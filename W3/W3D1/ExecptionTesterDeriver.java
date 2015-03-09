/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

/**
 *
 * @author jambo
 */
public class ExecptionTesterDeriver {

    public static void main(String[] args) {
        try {
            try{
            doThingA();
            }catch (Exception e){
                System.out.println("Some Exceptions Occured");
            }
        } catch (MyException ex) {
            System.out.println("this is my catch");
        }
    }

    public static void doThingA(){ //throws MyException {
        doThingB();
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
