package w2d4;

/**
 *
 * @author jambo
 */
public abstract class Vehicle {

    private int x = 10;
    private int y = 10;
    private int speed = 10;
    private int direction = 45;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        x = (int) Math.cos(direction);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        y = (int) Math.sin(direction);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void move(double amount) {
        amount += (int) (Math.cos(90) * getSpeed());
    }

    public void turn(double amount) {
        amount += Math.toDegrees(amount);
    }

    public abstract double accelerate();

    public abstract int brake();
}
