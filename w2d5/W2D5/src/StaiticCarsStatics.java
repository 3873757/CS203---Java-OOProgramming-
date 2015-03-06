/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class StaiticCarsStatics extends Automobile {

    private int x;
    private int y;
    private String location;

    public StaiticCarsStatics() {
        super();
    }

    public StaiticCarsStatics(String make, String model,int year ,String color) {
        super(make,model,year ,color);
    }

    public static int getX(StaiticCarsStatics This) {
        return This.x;
    }

    public static void setX(StaiticCarsStatics This, int x) {
        This.x = x;
    }

    public static int getY(StaiticCarsStatics This) {
        return This.y;
    }

    public static void setY(StaiticCarsStatics This, int y) {
        This.y = y;
    }

    public static int moveUp(StaiticCarsStatics This, int y) {
        This.y = This.y + 4;
        return This.y;
    }

    public static int moveDown(StaiticCarsStatics This, int y) {
        This.y = This.y - 4;
        return This.y;

    }

    public static int moveRight(StaiticCarsStatics This, int x) {
        This.x = This.x + 4;
        return This.x;
    }

    public static int moveLeft(StaiticCarsStatics This, int x) {
        This.x -= This.x - 4;
        return This.x;
    }

    public static void setLocation(StaiticCarsStatics This, String location) {
        This.location = location;
    }

    public static String getLocation(StaiticCarsStatics This) {
        return This.location;


    }
}
