package abstractClass;
                              //abstract class
abstract class Animal{ 
	                         //Abstract Method (Does not have a body)
	public abstract void AnimalSound(); 
                              //Regular Method
    public void Sound() {
    	System.out.println("Zzzzz");
    }
    	
    }
              //Sub class inherit from animal
  class Rabbit extends Animal{
	  public void AnimalSound() {       //overrided method
		  System.out.println("The Rabbit Says: See See");
	  }
	  
  }
  class Dog extends Animal{
	  Dog(){    //contructor
		  
	  }
	  public void AnimalSound() {
		  System.out.println("The dog Says: bow bow");
	  }
  }
public class AbstractClass {

	public static void main(String[] args) {
		Rabbit r1=new Rabbit();
		r1.AnimalSound();
         r1.Sound();
         Dog d1=new Dog();
         d1.AnimalSound();
         d1.Sound();
         
	}

}

