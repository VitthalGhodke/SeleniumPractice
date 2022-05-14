package exception;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		try {
			int k=25/0;
			System.out.println(k);
		}catch(Exception e) {
			System.out.println("Exception Handel");
			
		}finally {
			System.out.println("finally block is always executed");
		}
System.out.println("program end");
	}

}
