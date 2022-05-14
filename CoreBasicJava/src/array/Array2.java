package array;

public class Array2 {

	public static void main(String[] args) {
		//int[] age;
	//	age =new int[6];
		
		
		int[] age= {25,10,12,56,40,60};
		System.out.println("First element:"+age[0]);
		System.out.println("Second element:"+age[1]);
		System.out.println("Third element:"+age[2]);
		System.out.println("Forth element:"+age[3]);
		System.out.println("Fifth element:"+age[4]);
		System.out.println("Sixth element:"+age[5]);
		System.out.println("***************Using for Loop:");
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
    		if(age[i]==60) {
 			System.out.println(age[i]);
			break;
			}else {
			System.out.println("age is not 60");
 			}
		}
		System.out.println("************Using for-each Loop:");
		for (int a : age) {
			System.out.println(a);
			if(a==60){
			System.out.println(a);
			break;
			}else {
				System.out.println("age is not 60");
			}
		}
	}
	

}

