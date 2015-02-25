/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author jambo
 */
public class DogTestDriver {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Bart");
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        myDogs[0].setName("Fred");
        myDogs[1].setName("Marge");
        dog1.setName(null);
        dog1.bark();
        System.out.print("Last dog's name is ");
        myDogs[2].setName("Bart");
        System.out.println(myDogs[2].getName());
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
