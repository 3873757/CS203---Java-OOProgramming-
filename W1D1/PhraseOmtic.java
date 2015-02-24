public class Pets {

	public static void main(String[] args) {
		String[] pets = {"Fido","Zues","bin"};
		int x =pets.length;
		int randx =(int) (Math.random()*x);
		String s=pets[randx];
		System.out.println(s + " "+ "is a dog");
	}

}
