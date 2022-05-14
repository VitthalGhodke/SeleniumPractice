package keywords;

public class This1 {
	int rollno;
	float fee;
	This1(int rollno, float fee){
		System.out.println("Local rollno :"+ rollno);
		System.out.println("Local fee:"+fee);
		
		System.out.println("Local rollno :"+ this.rollno);
		System.out.println("Local fee:"+this.fee);
		
	}
	void display() {
		System.out.println(rollno+"     "+fee);
		System.out.println(this.fee);
	}

	

	public static void main(String[] args) {
		This1 c1=new This1(01, 54000f);
		c1.display();
		This1 c2=new This1(02,20000f);
		c2.display();
		
		}
	}
/**
 * this keyword:
 * 	- Its an instance of current class
 *  - its use to differentiate non-static global and local variable when they have same name
 *  - can be use to call non-static members of the class
 */