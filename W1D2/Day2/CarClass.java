public class Car {
	private int x;
	private int y;

	public void moveUp() {
		 y+= 1;
	}

	public void moveDown() {
		y-=  1;
	}

	public void moveRight() {
		 x+= 1;
	}

	public void moveLeft() {
		x-= 1;
	}

	public int getx() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int gety() {
		return y;
	}

	public void sety(int y) {
		this.y = y;
	}

	public void printLocation() {
		System.out.println(getx() + "," + gety());
	}
}
