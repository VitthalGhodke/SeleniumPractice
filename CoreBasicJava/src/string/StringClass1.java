package string;

public class StringClass1 {

	public static void main(String[] args) {
		StringClass1 c1=new StringClass1();
		System.out.println(c1);//String representation of an object because of tostring().
		
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
		}
	}
/**
String-->	
		predefined class in java belongs to java.lang package 
		it represents group/collection of characters
		In String class following methods are override
				1. toString() --> instead of printing string representation of object it will print value stored 
								  inside the string object
				2. equals()   ---> overrided 
				3. hashCode()
		We can create String class object in two ways
			1. by using new keyword
						---> object will be stored in non constant pool
						---> by using this we can have duplicate object also
			2. by using literal 
						---> object will be stored in String constant pool(inside heap)
						---> by using this we can create only unique object inside the pool
*/