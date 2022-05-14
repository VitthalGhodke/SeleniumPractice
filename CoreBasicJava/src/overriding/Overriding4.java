package overriding;
 
class ABC{
	public void mymethod() {
		System.out.println("I am Method of ABC class");
	}
}
public class Overriding4 extends ABC{
	public void mymethod() {
		
		System.out.println("Overriding method of Overriding4 class");
		super.mymethod();
	}

	public static void main(String[] args) {
		Overriding4 k=new Overriding4();
		k.mymethod();

	}

}
