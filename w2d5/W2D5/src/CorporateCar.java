/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class CorporateCar extends Vehicle {

    private double price;
    private double value;
    private int year;
    private String employee;

    public CorporateCar() {//default constructor no args
        super();
    }

    public CorporateCar(double price, double value) { //employee null
        this.value = value;
        this.price = price;
        this.year = 2015;
    }

    public CorporateCar(double price, double value, int year, String employee) {
        this.employee = employee;
        this.year = year;
        this.price = price;
        this.value = value;
    }
    public CorporateCar(double x, double y, double direction, double price, double value,
            int year, String employee) {
        super(x, y, direction);       //calling parent class 
        System.out.println("Remaining params initializing below ...");
        this.employee = employee;
        this.price = price;
        this.value = value;
        this.year = year;        
        
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = "JENBER";
    }

}
