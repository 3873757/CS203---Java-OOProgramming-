/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d4;

/**
 *
 * @author jambo
 */
public class CorporatCar extends Vehicle implements Asset {

    private double purchaseprice;
    private double currentValue;
    private int yearPurchsed;
    private String employee;

    public void setPurchaseprice(double purchaseprice) {
        this.purchaseprice = 6543.23;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = 3452;
    }

    public int getYearPurchsed() {
        return yearPurchsed;
    }

    public void setYearPurchsed(int yearPurchsed) {
        this.yearPurchsed = yearPurchsed;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = "Alen";
    }

    @Override
    public double accelerate() {
        for (double speed = 0; speed <= 65; speed++) {
            speed += 5;
        }
        return getSpeed();
    }

    @Override
    public int brake() {
        setSpeed(getSpeed() - 5);
        if (getSpeed() < 0) {
            setSpeed(0);
        }
        return getSpeed();
    }

    @Override
    public int amortize(int year) {
        return (int) (purchaseprice - (purchaseprice / year) * yearPurchsed);
    }

    @Override
    public double getpurchaseprice() {
        
        return purchaseprice;
    }

    @Override
    public double getcurrentValue() {
        
        return currentValue;

    }
}