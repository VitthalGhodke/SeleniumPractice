package inheritance;
//parent class
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweets");
	}
}
  //child class fruit
class Orange extends fruits{
	int fruitAge;
	  Orange(){
		// super(); //java compiler will write default super()
		  System.out.println("Orange class Cons..");
		  fruitAge= 8;
	  }
	  public void taste() {
		  System.out.println("Orange are sweet");
	  }
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);
		System.out.println("Fruits fruitAge: "+super.fruitAge);
		taste();
		super.taste();
	}

	 
}
public class Inheritance7 {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		Orange o1=new Orange();
		o1.shape();
		System.out.println("*******************************************");

	}

}
/*
 * super: is a keyword or instance of super class
 * 			use to refer super class non-static members
 * 			mainly used when subclass and super class having common non-static members
 */ 
