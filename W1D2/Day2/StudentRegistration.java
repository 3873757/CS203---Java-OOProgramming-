/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

/**
 *
 * @author jambo
 */
public class StudentRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setFirstName("Tommy");
        s1.setLastName("Fred");
        s1.setAge(23);
        s2.setFirstName("Balcha");
        s2.setLastName("AbaNefso");
        s2.setAge(134);
        s1.printInfo();
        s2.printInfo();
    }
}
