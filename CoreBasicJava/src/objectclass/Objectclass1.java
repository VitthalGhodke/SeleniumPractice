package objectclass;

public class Objectclass1 {
	static int last_roll = 100;
	int roll_no;
	
	Objectclass1(){
		roll_no = last_roll;    //100
        last_roll++;            //101
	}
	@Override
    public int hashCode()
    {
        return roll_no;
    }
	
	public static void main(String[] args) {
		Objectclass1 s=new Objectclass1();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		
	}

}
