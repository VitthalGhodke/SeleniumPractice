package array;

public class SumAndAverageOfarray {

	public static void main(String[] args) {
		int Vitthal[]= {10,16,55,26,40,18,23};
		double sum=0;
		double Average;
		for(int number:Vitthal) {
			sum=sum+number;
	}
		int ArrayLength=Vitthal.length;
		Average=sum/ArrayLength;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + Average);
		System.out.println(Vitthal.length);
		
				

	}

}
