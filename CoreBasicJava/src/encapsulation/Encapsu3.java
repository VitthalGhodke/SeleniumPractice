package encapsulation;

class Encapsulation{
	private int age =20;
	private double salary=70000;
	private float marks=95.5f;
	private char grad='A';
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public char getGrad() {
		return grad;
	}
	public void setGrad(char grad) {
		this.grad = grad;
	}
	
}

public class Encapsu3 {

	public static void main(String[] args) {
   Encapsulation E=new Encapsulation();
   System.out.println("Get age:"+E.getAge());
   System.out.println("Get salary:"+E.getSalary());
   System.out.println("Get Marks:"+E.getMarks());
   System.out.println("Get Grade:"+E.getGrad());
   System.out.println("**********Update & access*********");
   E.setAge(30);
   E.setSalary(900000);
   E.setMarks(90.6f);
   E.setGrad('A');
   
   System.out.println("Get age:"+E.getAge());
   System.out.println("Get salary:"+E.getSalary());
   System.out.println("Get Marks:"+E.getMarks());
   System.out.println("Get Grade:"+E.getGrad());


	}

}
