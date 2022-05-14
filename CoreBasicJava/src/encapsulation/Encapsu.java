package encapsulation;
class Demo{
	private int empID=123;
	private double salary=45000;
	//getter method---->Read only Dont modify
	public int getempID() {
		return empID;
	}
	public double getsalary() {
		return salary;
	}
	//setter method----->Modify the private variable
	public void setempID(int e) {
		empID=e;
	}
	public void setsalary(double salary) {
		this.salary=salary;            //using this keyword differntiate local and global variable
	}
}
public class Encapsu {

	public static void main(String[] args) {
		Demo k1=new Demo();
		System.out.println("Accessing private member outside the class using getter concept,getempID :"+k1.getempID());
		System.out.println("Accessing private member outside the class using getter concept,getsalary :"+k1.getsalary());
		System.out.println("*****Updating private data members********");
		k1.setempID(333);
		k1.setsalary(65000);//modify using set method & access using get method 
		System.out.println("Updated Accessing private member outside the class using getter concept,setempID :"+k1.getempID());
		System.out.println("Updated Accessing private member outside the class using getter concept,setsalary :"+k1.getsalary());
	}

}
