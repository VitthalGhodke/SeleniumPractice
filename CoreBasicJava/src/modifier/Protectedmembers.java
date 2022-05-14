package modifier;

public class Protectedmembers {
	protected double salary=76000;
	protected void display2() {
		System.out.println("Protected salary:"+salary);
	}

	public static void main(String[] args) {
		Protectedmembers p=new Protectedmembers();
		p.display2();
        System.out.println(p.salary);
	}

}
class accessProtectedmembers{
	public static void main(String[] args) {
		Protectedmembers p=new Protectedmembers();
		System.out.println("Accessing Protected members from child class");
		p.display2();
        System.out.println(p.salary);
	}
}