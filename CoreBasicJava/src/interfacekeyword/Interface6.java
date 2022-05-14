package interfacekeyword;
interface Animal{
	int age =30;
	void sound();  // interface method (does not have a body)
	void sleep();  // interface method (does not have a body)
}
class Dog implements Animal{
	public void sound() {
		System.out.println("Dog is Barking");
	}
	public void sleep() {
		System.out.println("Dog is sleep");
	}
}
public class Interface6 {

	public static void main(String[] args) {
		Animal A=new Dog();
        A.sound();
        A.sleep();
        System.out.println("ooooooooooooooooooo@@@oooooooooooooooooooo");
        Dog d=new Dog();
        d.sound();
        d.sleep();
        System.out.println("Age:"+Animal.age);
	}

}
