package exception;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		try {
			System.out.println("Inside the try block");
			// below code throws divide by zero exception
		double k=25/4.0;
		//System.exit(0);//after this jvm stop the execution
			System.out.println(k);
			
			// cannot handle Arithmetic type exception
			// can only accept Null Pointer type exception
		}catch(NullPointerException e) {
			System.out.println(e);
		}

	}

}
