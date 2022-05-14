package overriding;
class Animal{
	public void move() {
		System.out.println("Animal can move");
	}
}
class Dog extends Animal{
	public void move() {    //method override
		System.out.println("Dog can walk and run");
	}
	public void bark() {
		System.out.println("doks can barks");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		Animal a=new Animal(); //object and referance for parent class
		a.move();
		Dog g=new Dog();     //animal referance but dog object
		g.move();            // run the method in dog class
		g.bark();             // run the method in dog class
		System.out.println("******************************");
		Animal a1=new Dog(); //you will get dog class move(), bark().
		a1.move();
		//a1.bark();   // Compile time error because referance type is animal 
		
		

	}

}
