package encapsulation;
class student1{
	private int marks=99;
	public void setmarks(int m) { //Write only using setter method
		m=marks;
	}
}

public class Encapsu2 {

	public static void main(String[] args) {
		student1 k=new student1();
		k.setmarks(85);            //Write only means dont show in console
		System.out.println("End");

	}

}
