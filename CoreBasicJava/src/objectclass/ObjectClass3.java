package objectclass;
class Print{
	int a=10;
	public int hashCode() {
		return 101;
		
	}
	public String toString() {
		return "i am string of class print";
	}
	public boolean equals(Object k) {
		Print v=(Print)k;
		return (this.a==v.a);
		
		
	}
}

public class ObjectClass3 {
	static int last_roll = 100;
	int roll_no;
	ObjectClass3()
    {
        roll_no = last_roll;
        last_roll++;
    }	

	public static void main(String[] args) {
		//Object obj;
		ObjectClass3 s = new ObjectClass3();
		System.out.println("s: toString of ObjectClass4: "+s);//Day32String.ObjectClass4@jhuy98798
		System.out.println("s: hashCode of ObjectClass4: "+s.hashCode());//68768757
		
		ObjectClass3 s1 = new ObjectClass3();
		System.out.println("s1: toString of ObjectClass4: "+s1);//Day32String.ObjectClass4@jhuy98798
		System.out.println("s1: hashCode of ObjectClass4: "+s1.hashCode());//68768757
		System.out.println(s.equals(s1));//false
		
		Print p1=new Print();
		System.out.println("toString of Print: "+p1);//I am Print Class toString
		System.out.println("hashCode of Print: "+p1.hashCode());//101
		Print p2=new Print();
		System.out.println(p1.equals(p2));//
	}

}
