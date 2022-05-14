package overriding;

class Human {

	// Overridden method
	// in overriding we can increase the visibility of overrided method --> private
	// -->default-->protected-->public
	// default ---> protected or public
	// protected ---> public
	// public ----> public

	public void eat() {
		System.out.println("Human is eating");
	}
}

class Boy extends Human {
	// Overriding method
	public void eat() {
		System.out.println("Boy is eating");

		super.eat(); // intance for parent class

	}
}

public class Overriding3 {

	public static void main(String[] args) {
		Boy b1 = new Boy();
		b1.eat();
		Human h = new Human();
		h.eat();

	}

}
