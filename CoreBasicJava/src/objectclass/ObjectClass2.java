package objectclass;

public class ObjectClass2 {
	
	static int age=30;
	int age1;
	
	ObjectClass2(){
		age1=age;
		age++;
		
	}
	@Override
    public String toString()
    {
        return "BasicCoreJava";
    }
	
	public static void main(String[] args) {
		ObjectClass2 k=new ObjectClass2();
		System.out.println(k);
		System.out.println(k.toString());
		
	}

}
