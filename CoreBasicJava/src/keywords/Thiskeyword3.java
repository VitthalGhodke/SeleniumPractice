package keywords;

public class Thiskeyword3 {
	int rollno;
	float fee;
	Thiskeyword3(int rollno, float fee){
		System.out.println("local rollno"+rollno);
		System.out.println("local fee"+fee);
		System.out.println("gv rollno"+this.rollno);
		System.out.println("gv fee"+this.fee);
	}

	public static void main(String[] args) {
		
		Thiskeyword3 vk=new Thiskeyword3 (17,55000f);
		
		
		
	}

}
