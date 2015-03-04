/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author jambo
 */
public class Scientist {

    private String name;
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void changeThese(int subjectA,  GuineaPig subjectB) {
      subjectA++; //to use this in main class we should change it to return type
      subjectB.setName("Kucky");
      
    }
}
