package keywords;

public class Bloks {
	
	{          // non-static block or non static initialization block or IIB 
		System.out.println(" Running non-static-block of class Blocks..");
	}

	
	static {  // static block or static initialization block or SIB 
		System.out.println(" Running static-block of class Blocks..");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts");
		System.out.println("I am main() of Blocks class...");
		System.out.println("main() ends");
	}
}

/**
 * If any class contains SIB then this block gets executed before main()
 * as it doesn't have any name hence its gets called automatically before main
 * if a class has more than one SIB then all the SIB gets executed in sequential order before main
 * to execute SIB we must have main()
 */ 

