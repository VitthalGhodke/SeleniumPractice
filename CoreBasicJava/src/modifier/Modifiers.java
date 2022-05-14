package modifier;

public class Modifiers {
	private int num1=11;    // Private modifier
	int num2=22;            // Default Modifier
	protected int num3=33; // protected modifier
	public int num4=44;    // public modifier
	

	public static void main(String[] args) {
		Modifiers M= new Modifiers();
		System.out.println("Private modifier:"+M.num1);
		System.out.println("Default Modifier:"+M.num2);
		System.out.println("protected modifier:"+M.num3);
		System.out.println("public modifier:"+M.num4);
        System.out.println("*********************************");
	}

}
class accessmodifire{
	public static void main(String[] args) {
		Modifiers M1= new Modifiers();
		//System.out.println("Private modifier:"+M.num1);
		System.out.println("Default Modifier:"+M1.num2);
		System.out.println("protected modifier:"+M1.num3);
		System.out.println("public modifier:"+M1.num4);
	}
}