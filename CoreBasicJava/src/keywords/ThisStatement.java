package keywords;

public class ThisStatement {

	ThisStatement()
	{
		System.out.println("******Zero-Param*********");
	}
	ThisStatement(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement(char c, double d)
	{
		System.out.println("******char-double-Param*********");
	}
	public static void main(String[] args) {
		
		ThisStatement t1=new ThisStatement();
		ThisStatement t2=new ThisStatement(25);
		ThisStatement t3=new ThisStatement('c',25.36);
	}
}

/**
 * this()--> 
 * 			this statement is an instance of current class which is declared inside the constructor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
*/