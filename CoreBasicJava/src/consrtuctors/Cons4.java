package consrtuctors;

public class Cons4 {
	int i;
	Cons4(){
		System.out.println("running cons 4() constructor");
		i=10;
	}
	void display() {
		System.out.println("I am display of Cons4()"+i);
	}
	
 public static void main(String[] args) {
		Cons4 v1=new Cons4();
		v1.display();
		
		
	
		
	}

}
