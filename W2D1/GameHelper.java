/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2;

/**
 *
 * @author jambo
 */
import java.io.*;
//import java.util.Scanner;

public class GameHelper {

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("IOException:  " + e);
        }
        return inputLine;
    }
}
