package keywords;

public class Finalkeyword1 {
	

	final int empId=90;
	double salary=34400.67;
	void run() {
		System.out.println("empId: "+empId);
	}

	public static void main(String args[]) {
		Finalkeyword1 obj = new Finalkeyword1();
		obj.run();
		System.out.println(obj.salary);
	}
}