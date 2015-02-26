/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author jambo
 */
public class HamsteTestDrive {

    public static void main(String[] args) {
        double sum = 0;
        Hamster hams = new Hamster();
        Hamster[] Hams = new Hamster[100];
        for (int i = 0; i < Hams.length; i++) {
            Hams[i] = hams;
            Hams[i].age = Math.random() * 3;
            sum += Hams[i].age;
        }
        System.out.println(sum / Hams.length);
    }
}
