package array;

public class Array0 {
	

	public static void main(String[] args) {
		
		
	  int[] num1= {10,11,12};
	  System.out.println(num1.length);
	  System.out.println(num1[0]);
	  System.out.println(num1[1]);
	  System.out.println(num1[2]);
	  
	  System.out.println("print all element using for loop");
	  for(int i=0;i<num1.length;i++) {
		  System.out.println(num1[i]);	
	}
	  System.out.println("using for-each loop");
	  for(int num:num1) {
		  System.out.println(num);
		}
	 char[] vitthal=new char[] {'a','b','c','d','e','f'};
	 System.out.println("**using each for loop");
	 for(char num:vitthal) {
		 System.out.println(num);
		 
	 }
	 System.out.println("using for loop");
	 for(char a=0;a<vitthal.length;a++) {
		 System.out.println(vitthal[a]);
	 }
	
	  
	}

}
//int a=10,b=20,c=30;
		/*datatype[] arrayname;
		 *    OR
		 * arrayname=new datatype[size]
		 *    OR
		 * datatype[] arrayname = new datatype[size]
           or
           datatype[] arrayname={ , , , };
           
		 */