package keywords;

public class ThisStatement3 {

	ThisStatement3() {	
		this(25.36);
		System.out.println("hello zero");
	}
	ThisStatement3(double d) {
		this(15);
		System.out.println("hello double " + d);
	}
	ThisStatement3(int x) {
		System.out.println("Hello int " + x);
	}


	public static void main(String args[]) {
		ThisStatement3 a1=new ThisStatement3();
	 ThisStatement3 a2=new ThisStatement3(10);
		 ThisStatement3 a3=new ThisStatement3(10.23);
			//or
		//ThisStatement3 a1 = new ThisStatement3();
	}
}

/**
 * this()---> statement
 * this(): used to call another constructor of current class based on its argument
 * this(): should be the first statement inside the constructor body
 */
