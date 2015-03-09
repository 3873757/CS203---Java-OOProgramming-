/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w3;

/**
 *
 * @author jambo
 */
public class MyException extends RuntimeException {

    public MyException() {
    }

    public MyException(String string) {
        super(string);
    }

    public MyException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MyException(Throwable thrwbl) {
        super(thrwbl);
    }
}
