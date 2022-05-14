package inheritance;
class Grandfather{
	  Grandfather(){
		  System.out.println("I am a constructor of Grandfather class");
	  }
	  void Myhome() {
		  System.out.println("I am home of Grandfathet");
	  }
}
           //subclass / child class / derived class
class Father extends Grandfather{
	  Father (double d){
		  super();// if we dont wirte this dn java compiler will write by default super()
		  System.out.println("I am a constructor of Father class");
	  }
	  void Mycar() {
		  System.out.println("I am car of Father");
	  }
}
class Child1 extends Father{
	Child1(int i) {
		super(12.32); //its here because father cons consist of double parameterise cons
		System.out.println("I am Class Child constrctuor...");
	}
	void Mybike() {
		System.out.println("I am bike of Child1");
	}
}
public class Inheritance6 {

	public static void main(String[] args) {
		System.out.println("********************************************");
	Child1 k1=new Child1(51);
	k1.Mybike();
    k1.Mycar();
    k1.Myhome();
    System.out.println("*******************************************");
	
    Father f1=k1;   //creating an object or instance of child most class and referred by its parent
    f1.Myhome();   //Father f2 = new Child1(12); home, car but bike will not be visible/accessible to father
	f1.Mycar();
	System.out.println("*******************************************");
	// creating an object or instance of child most class and referred by its parent
	Grandfather g1 = k1;//Grandfather g2=new Child1(20); home but car & bike will not be visible/accessible to Grandfather
	g1.Myhome();
	System.out.println("*******************************************");
	// creating an object or instance of child most class and referred by its parent
	Grandfather g2 = new Father(12.36);// home but car& bike will not be visible/accessible to father
	g2.Myhome();
	}

}
