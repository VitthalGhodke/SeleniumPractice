package keywords;

public class ThisStatement1 {
	
	ThisStatement1()
	{
		this('a',12.32);
		System.out.println("******Zero parameter***");
	}
	ThisStatement1(int age)
	{
		System.out.println("******int parameter******");
	}
	ThisStatement1(char a,double d)
	{
		this(25);
		
		System.out.println("****char double parameter*******");
	}
	

	public static void main(String[] args) {
		ThisStatement1 k1=new ThisStatement1 ();
		

	}

}
