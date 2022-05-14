package exception;
import java.util.Scanner;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("program strats here..");
		Scanner s1=new Scanner(System.in);
		 System.out.println(s1);
		 System.out.println("Enter array size");
		 int[] ID=new int[3];
		
		 try {
			 System.out.println(ID[3]);
			
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
			//e.printStackTrace();
				//System.out.println(e.getMessage());
			 
		 }
		 System.out.println("program end here");
		

	}

}
