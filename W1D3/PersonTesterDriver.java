/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author jambo
 */
public class PersonTesterDriver {
    public static void main(String[] args) {
        Person P = new Person();
        P.name = "John Deo";
        Person[] P1 = new Person[5];
        for (int i = 0; i < P1.length; i++) {
            P1[i] = P;
            //System.out.println(P1[i].name); // it prints John Deo
            P1[0].name = "Smith doe";
            System.out.println(P1[i].name);
        }
        // System.out.print(P.name);   // P.name Changed into Smith Deo too
    }
}
