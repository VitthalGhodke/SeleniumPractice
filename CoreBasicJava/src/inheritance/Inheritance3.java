package inheritance;
 class Fourwheeler{
	              //Default constructor
	   public void wheele() {
		   System.out.println("I am a fourwheeler");
	   }
 }
class Car extends Fourwheeler{  
	               //Default constructor & super()  
	 public void type() {
		 System.out.println(" I am a car");
	 }
}
 class Maruti extends Car{ 
	             //Default constructor & super()
	 public void car() {
		 System.out.println("I am a maruti");
	 }
 }
public class Inheritance3 {

	public static void main(String[] args) {
		Maruti k1=new Maruti();  // creat an object for child class
		k1.wheele();
		k1.type();
		k1.car();
		

	}

}
