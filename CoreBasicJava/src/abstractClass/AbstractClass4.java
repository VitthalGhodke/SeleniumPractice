package abstractClass;
abstract class Abs {
	// global variable
	int age=23;
	// constructor
	Abs(){
		System.out.println("I am Cons of Abs class");
	}
	// normal or non-abstract or concrete method
   double Display() {
		System.out.println("i am method of Abs"+age);
		return 23.3;
	}
	// abstract method
	abstract double ABC();
	
}

abstract class Abs1 { 
	// abstract method ------>
	abstract void call1();
	abstract void call2();
	// non-abstract method
	void display() {
		System.out.println("Hello");
	}
}
abstract class Abs2 {
	// abstract method  ---->100%
	abstract void call1();
	abstract void call2();
}
abstract class Abs3 {
	// non-abstract method ----->0%
	void display() {
	}
}

public class AbstractClass4 {

	public static void main(String[] args) {
		

	}

}
