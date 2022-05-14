package string;

public class StringClass2 {

	public static void main(String[] args) {
		StringClass2 c1=new StringClass2();
		System.out.println(c1);//String representation of an object because of tostring().
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		//StrinClass object creation using literal
		String s1="Ashti";//new object create in string constant pool.
		String s2="Ashti";//no object will be create as its a dublicate object, so s2 will points to s1. 
		String s3="Beed";//new object create in string constant pool.
		System.out.println("s1: " +s1);//print object value becouse toString()is overrided in string class
		System.out.println("s2: " +s2);
		System.out.println("s3: " +s3);
		
		System.out.println("s1 char count:" +s1.length());
		System.out.println("s2 char count: " +s2.length());
		System.out.println("s3 char count: "+s3.length());
	
/*   Outside string class
 *        == --> compaire two value
 *  .equals(obj)--> Compaire two object based on there address
 *  
 *   Inside string class
 *   == --> compaire two object based on its address
 *   .equals(obj)--> Compaire two object based on value
 */
	System.out.println("s1 & s2 using equal():"+s1.equals(s2));//Compaire two object based on value
	System.out.println("s1 & s2 using == :"+(s1==s2));//compaire two object based on its addres
	System.out.println("s1 & s3 using equal():"+s1.equals(s3));
	System.out.println("s1 & s3 using == :"+(s1==s3));
	String s4=new String("Ashti");
	System.out.println(s4);
	System.out.println(s1.equals(s4));
	System.out.println(s1==s4);
	System.out.println(s3.equals(s4));
	System.out.println(s4==s3);
	
	}
}