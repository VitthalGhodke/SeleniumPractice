package keywords;

 public class Thiskeyword {
	 int x;
		// Constructor with a parameter
		public Thiskeyword(int x) {
			System.out.println("Local variable x: "+x);
			System.out.println("Global variable x: "+this.x);
			this.x = x;
			System.out.println("Local variable x: "+x);
			System.out.println("Global variable x: "+this.x);
		}
		// Call the constructor
		public static void main(String[] args) {
			Thiskeyword m1 = new Thiskeyword(45);
			System.out.println("Value of x = " + m1.x);//
		}
	}

/**
 * this keyword:
 * 	- Its an instance of current class
 *  - its use to differentiate non-static global and local variable when they have same name
 *  - can be use to call non-static members of the class
 */

	


