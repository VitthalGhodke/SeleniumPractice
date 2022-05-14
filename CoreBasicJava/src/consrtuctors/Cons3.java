package consrtuctors;

public class Cons3 {
	int roll;
	double salary;
	Cons3(int r, double s){
		roll=r;
		salary=s;
	}
  void display () {
	  System.out.println(roll+ "  "+ salary);
  }
	public static void main(String[] args) {
		Cons3 c1= new Cons3( 10,  25000.23);
		c1.display();
		Cons3 c2=new Cons3(20 , 30000.30);
		c2.display();
		

	}

}
