package conditons;

public class Ifelseif {

	public static void main(String[] args) {
		int marks=87; 
		if(marks<50){
			System.out.println("fail");  
		}        				
		else if(marks>=50 && marks<60){  
			System.out.println("D grade");  
		}  
		else if(marks>=60 && marks<70){  
			System.out.println("C grade");  
		}  
		else if(marks>=70 && marks<80){  
			System.out.println("B grade");  
		}  						
		else if(marks>=80 && marks<90){  
			System.out.println("A grade");  
		}else if(marks>=90 && marks<100){  
			System.out.println("A+ grade");  
		}else{  
			System.out.println("Invalid!");  
		}  
		
		double Marks=60;
		if (Marks>75) {
			System.out.println("First class with Distingtion");
		}else if(Marks>=60&& Marks<70) {
			System.out.println("First Class");
		}else if(Marks>=50 && Marks<60) {
			System.out.println("Second Class");
		}else if(Marks>40 && Marks<50) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
		}

	}

}
