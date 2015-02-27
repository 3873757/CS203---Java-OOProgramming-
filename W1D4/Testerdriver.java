/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author jambo
 */
public class Testerdriver {
    public static void main(String[] aregs){
    Scientist S1 = new Scientist();
    GuineaPig G1 = new GuineaPig();
    //S1.setName("Roberts Eculans");
    G1.setName("dukkey");
    int value1 =11;
    System.out.println(value1 + " " + G1.getName());
    S1.changeThese(value1, G1);
    System.out.println(value1 + " " + G1.getName());
    
    
    
    
  
    }
}