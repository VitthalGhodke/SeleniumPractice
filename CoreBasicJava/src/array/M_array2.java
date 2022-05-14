package array;

public class M_array2 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5},{7,8,9,4}};
		for (int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++){
			System.out.print(arr[i][k]+" "); 
			}
			System.out.println();
		}
		System.out.println("*****************");
		char [][] chararray= {{'A','B','C','D'},{'P','Q','R'},{'K','L','M','N','O','P'}};
		for(int i=0;i<chararray.length;i++) {
			for(int j=0;j<chararray[i].length;j++) {
				System.out.print(chararray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
