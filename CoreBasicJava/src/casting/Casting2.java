package casting;
class cast1{
	


double student() 
{
	System.out.println("Running test1");
    return 4;//
}
}

public class Casting2 {

	public static void main(String[] args) {
		System.out.println("program starts");
		cast1 c1=new cast1();
		
		int i=(int)c1.student();
		c1.student();
		System.out.println(i);
	}

}
