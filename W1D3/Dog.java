/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author jambo
 */
public class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(this.name + " Says Ruff ");
    }

    public void eat() {
    }

    public void chaseCat() {
    }
}
