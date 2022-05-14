package array;
class practice{
	static int[] getarray() {
		return new int[] {10,30,50,90,60};
		
		
	}
}

public class Array5 {

	public static void main(String[] args) {
		int arr[]=practice.getarray();
		System.out.println(practice.getarray());
         for(int i=0;i<arr.length;i++) {
           System.out.println(arr[i]);       	 
         }
	}

}
