package polymorphism;

class Vehicle{
	void Speed() {
		System.out.println("Vehicle Speed"); 
	}
}
 class Bus extends Vehicle{
	 void Speed() {
		 System.out.println("Bus Speed");
	 }
	
}


public class Overriding {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.Speed();
		Bus k=new Bus();
		k.Speed();

	}

}
