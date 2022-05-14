package abstractClass;
abstract class Bike{
	abstract void run();
	void speed(int speed) {
		System.out.println("Bike Speed:"+speed);
	}
}

class Honda extends Bike{
	void run () {
		System.out.println("Running Safely");
	}
	void speed(int speed) {
		System.out.println("Speed is:"+speed);
		super. speed(100);	
	}
	void colour() {
		System.out.println("Black in colour");
	}
}

public class AbstractClass1 {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.speed(56);
		h.colour();
	//Bike b=new Bike();  //Can't Creat the object of abstract class
		System.out.println("***********");
		Bike b=new Honda();
		b.run();
		b.speed(80);
		//b.colour();// take the refferance Bike and creat the object for Honda,inside bike colour method is not present

	}

}
