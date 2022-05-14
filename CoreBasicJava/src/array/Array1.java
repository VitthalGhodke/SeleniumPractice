package array;

public class Array1 {

	public static void main(String[] args) {
		/* int a[];             //declaration
	       a=new int[5];       // size initialization
		 */
             //or
		 
		 int a[]=new int[5];         //declaration and instantiation  
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[2]);
		 System.out.println(a[3]);
		 System.out.println(a[4]);
		 
		 a[0]=10;                   //initialization
		 a[1]=30;
		 a[2]=40;
		 a[3]=50;
		 a[4]=60;
	   System.out.println(a[0]);
	   System.out.println(a[1]);
	   System.out.println(a[2]);
	   System.out.println(a[3]);
	   System.out.println(a[4]);
	   System.out.println("Element count:" +a.length);
	   //or
	   
	   System.out.println("****Using normal for loop length of areray*****");
	   
	   for(int i=0;i<a.length;i++) {
		  
		   System.out.println(a[i]);
		   
	   }
	   
	   System.out.println("**Using for-each loop*****");
	   for(int i:a) {
		   System.out.println(i);
	   }
	   
	}

}
