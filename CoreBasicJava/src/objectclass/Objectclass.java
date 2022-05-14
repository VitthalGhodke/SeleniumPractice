package objectclass;

class Demo{
	void display() {
		System.out.println("I am a Display ()");
	}
}

public class Objectclass extends Demo{
	static int last_roll=100;
	int roll_no;
	//constructor
	Objectclass(){
		roll_no=last_roll;
		last_roll++;
		
	}

	public static void main(String[] args) {
	Objectclass k=new Objectclass();
	System.out.println(k);   //k.toString() -->string representation of an object
	System.out.println(k.toString());//string representation of an object
	System.out.println(k.hashCode());
	System.out.println("*******************************");
	Demo v=new Demo();
	System.out.println(v);
	System.out.println(v.toString());
	System.out.println(v.hashCode());
	System.out.println("*****************************");
	Demo vk=new Objectclass();
	System.out.println(vk);
	System.out.println(vk.toString());
	System.out.println(vk.hashCode());
	
	}

}
