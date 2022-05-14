package operators;

public class Unary {

	public static void main(String[] args) {
		 int a=10;
		 int b=a;
		 System.out.println("a:"+a);
		 System.out.println("b:"+b);
		 /* 
		  * pre: First perform the operation then use the updated value
		  * post: first use the value then perform the operation
		  * */
		 a=10;
		 int k=++a;
		 System.out.println("a:"+a); //11
		 System.out.println("k:"+k);//11
		 int j=k++;
		 System.out.println("j:"+j); //11
		 System.out.println("k:"+k);//12
          int r=21;
          System.out.println("r=:"+r++);//22
 		 System.out.println("r=:"+r);//22
 		System.out.println("r=:"+ ++r); //23
		 System.out.println("r="+r); //23
		 
	}

}
