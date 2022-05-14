package keywords;

public class ThisStatement4 {
	int rollno;
	float fee;
	ThisStatement4 (int rollno)
	{
		this.rollno=rollno;
		
	}
	ThisStatement4 (int rollno, float fee)
	{
		this(rollno);
		this.fee=fee;
		
	}
	void display() {
		System.out.println(rollno+"   "+fee);
		
	}
	public static void main(String[] args) {
		ThisStatement4 k1=new ThisStatement4 (2002);
		k1.display();
		ThisStatement4 k2=new ThisStatement4 (2121, 3636f);
		k2.display();
		
	}

}
