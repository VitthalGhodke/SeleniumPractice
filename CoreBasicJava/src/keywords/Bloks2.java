package keywords;

public class Bloks2 {

	/* non-static block or IIB */
	{
		System.out.println("running non-static-block1 of class Blocks2..");
	}
	public static void main(String[] args) {
		Bloks2 b1 = new Bloks2();
		System.out.println("main() Starts");
		
		System.out.println("---------------------------------");
		Bloks2 b2 = new Bloks2();
		System.out.println("main() ends");
		
		 {
			System.out.println("running non-static-block2 of class Blocks2..");
		}
	}
}