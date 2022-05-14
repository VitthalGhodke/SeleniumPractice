package inheritance;
class vehicle{
	public void wheel() {
		System.out.println("I am a vehicle class, i have a wheels");
	}
}
         //first child class of vehicle class
class Bike extends vehicle{
public void wheelct() {
	System.out.println("I am a Bike,I have a 2 wheels");
}
}
          //Second child class of vehicle class
class car1 extends vehicle{
public void wheelct() {
	System.out.println("I am a car1 I have a four wheels");
}
}
class Scooter extends vehicle{
public void wheelct() {
	System.out.println("I am a scooter I have two wheels");
}
}

public class Inheritance4 {
	
	public static void main(String[] args) {
		Scooter c1=new Scooter();
		c1.wheelct();
		car1 c2=new car1();
		c2.wheelct();
		Bike c3=new Bike();
		c3.wheelct();
		vehicle c4=new vehicle();
		c4.wheel();
		
		
		
	}

}
