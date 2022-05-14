package exception;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		try {
			int a=35,b=0, res=a/b;
			
		}catch(Exception e) {
			System.out.println("common task completed");
		}catch(Throwable e) {
			System.out.println("common task completed");
		}

	}

}
