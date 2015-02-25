/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentregistration;

/**
 *
 * @author jambo
 */
public class Student {

    private String FirstName;
    private int Age;
    private String LastName;

    public int findDateOfBirth() {
        return 2015 - Age;
    }

    public void setFirstName(String FName) {
        this.FirstName = FName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String LName) {
        this.LastName = LName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setAge(int a) {
        this.Age = a;
    }

    public int getAge() {
        return Age;
    }

    public int getfindDateOfBirth() {
        return 2015 - Age;
    }

    public void setfindDateOfBirth(int Dob) {
        this.Age = Dob;
    }

    public void printInfo() {
        System.out.println(getFirstName() + " " + getLastName() + " " + getAge() + " " + getfindDateOfBirth());
    }
}
