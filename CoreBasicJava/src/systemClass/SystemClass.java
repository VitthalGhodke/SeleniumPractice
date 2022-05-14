package systemClass;

public class SystemClass {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.home"));  //C:\Users\HP
		System.out.println(System.getProperty("user.dir")); //F:\Acclaration\Workspace\CoreBasicJava
		//System.exit(0); //stops/terminates the execution after this line
		// setting specific property
	    System.setProperty("user.country", "IND");
	    System.out.println(System.getProperty("user.country"));
	    
	    System.out.println("difference between the current time and midnight, January 1, 1970 UTC is: "
				+ System.currentTimeMillis());
		System.out.println("current time in " + "nano sec: " + System.nanoTime());
	}

}
