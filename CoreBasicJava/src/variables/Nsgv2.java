package variables;

public class Nsgv2 {
	int age;
	static double salary;
	

	public static void main(String[] args) {
		System.out.println("Program Strats");
		System.out.println("********Access static global variable*********");
		System.out.println("SGV:"+Nsgv2.salary);
		System.out.println("********Access Non-static global variable*********");
		Nsgv2 v1=new Nsgv2();
		System.out.println("NSGV:"+v1.age);
		
		
		System.out.println("Program End");

	}

}
