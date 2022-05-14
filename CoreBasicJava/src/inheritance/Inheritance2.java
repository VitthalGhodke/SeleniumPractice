package inheritance;

class fruit{                                                   //parent class
	      fruit(){
		   System.out.println("fruit class constructor");
	}
	 public void taste(){ 
		System.out.println("Fruits are sweet"); 
		
	 }
}
class apple extends fruit{                                       //child class
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class constructor");
	}
	public void shape() {
		System.out.println("Apple in round shape");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		apple k1=new apple();                                  //object of child class            
		k1.taste();                                            //call parent class method
		k1.shape();                                            //call child class method
		fruit v1=new fruit();                                  // object of parent class
		v1.taste();                                            // call parent call method


	}

}
