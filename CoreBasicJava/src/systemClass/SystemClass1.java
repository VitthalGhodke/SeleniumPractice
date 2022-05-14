package systemClass;

class demo{
	demo(){
		System.out.println("i am a constructors of class demo");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from Automation Testing");
	}
}

public final class SystemClass1 {
	static demo d1=new demo();
	public static void main(String[] args) {
		SystemClass1.d1.manualTesting();
		SystemClass1.d1.automationTesting();
		

	}

}
