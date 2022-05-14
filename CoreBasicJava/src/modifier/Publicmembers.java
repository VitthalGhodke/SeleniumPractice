package modifier;

public class Publicmembers {
	public int age=23;
	public void salary() {
		System.out.println("public age"+age);
	}

	public static void main(String[] args) {
		Publicmembers k=new Publicmembers();
        k.salary();
        System.out.println(k.age);
	}

}
class AccessPublicmembers{
	public static void main(String[] args) {
		Publicmembers k=new Publicmembers();
        k.salary();
        System.out.println(k.age);
	}
}