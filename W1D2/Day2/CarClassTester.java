ackage day2;

/**
 *
 * @author jambo
 */
public class CarTestDrive {
    //public class Cartestdrive {

    public static void main(String[] args) {
        Car myCar1 = new Car();
        Car myCar2 = new Car();
        myCar1.moveRight();
        myCar2.moveRight();
        myCar1.moveUp();
        myCar2.moveUp();
        myCar1.printLocation();
        myCar2.printLocation();

    }
}