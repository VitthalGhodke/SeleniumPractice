package inheritance;
class company{
	char name='K'; //global variable
	company(){
		int age=20;
		System.out.println("I am constructor of company");
		System.out.println("Age: "+age);

	}
	public void compname() {
		System.out.println("Company name PVT LTD");
		
			}
	public void comp() {
		System.out.println("Overloaded method");
		System.out.println(this.name);
		
	}
}
class employee extends company{
	char name;
	employee(){
		System.out.println("I am constructor of employee");
		name='V';
	}
	public void empname() {
		System.out.println("Employee name XYZ");
		System.out.println(super.name);
		System.out.println(this.name); 
	}
	public void empID() {
		System.out.println("emp ID 123");
		System.out.println(this.name); //instance of current class
		System.out.println(super.name);//instance of parent class
	}
}

public class Inheritance10 {

	public static void main(String[] args) {
		employee e1=new employee();//object for child class
		e1.empname();
		e1.empID();
		e1.compname();
		company c1=new company();//object for parent class
		c1.compname();
		c1.comp();
		

	}

}
