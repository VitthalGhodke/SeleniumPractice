package encapsulation;
class student{
	private int pincode=410105;
	public int getpincode(){     //Read only-->using getter method
		return pincode;
	}
	private double salary=80000;
	public double getsalary() {
		return salary;
	}
	public void setpincode(int e) {
		System.out.println("I am setter method of pincode");
		pincode=e;
	}
	public void setsalary(double d) {
		salary=d;
	}
}

public class Encapsu1 {

	public static void main(String[] args) {
		student s=new student();
		System.out.println(s.getpincode()); // Read only means show in console
        System.out.println(s.getsalary());
        s.setpincode(414203);
        System.out.println(s.getpincode());
        s.setsalary(90000);
        System.out.println(s.getsalary());
	}

}
