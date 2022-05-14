package wrapperClass;

public class Boxing {

	public static void main(String[] args) {
		boolean b=true;
		Boolean b1=false;
		Boolean b2=new Boolean (true);
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		byte b3=12;
		Byte b4=23;
		Byte b5=new Byte((byte)-2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
	   int age =16;
	   Integer age1=22;
	   Integer age2=new Integer (33);
	   System.out.println(age);
	   System.out.println(age1);
	   System.out.println(age2);
	   System.out.println(age==age1);
	}

}
