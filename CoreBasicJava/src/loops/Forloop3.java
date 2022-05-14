package loops;

public class Forloop3 {

	public static void main(String[] args) {
		System.out.println("************Vowels A to Z***************");
		for ( char c1='a'; c1 <= 'z'; c1++) {
			if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1 =='u')){
			System.out.println("Vowels is :"+ c1);
			}
	}
		System.out.println("*********Vowels Count between A to z**********");
		int ct=0;
		for ( char c1='a'; c1 <= 'z'; c1++) {
			if((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1 =='u')){
			System.out.println("Vowels is :"+ c1);
			++ct; //ct=ct+1;ct +=ct;
			}
	}
		System.out.println("Vowels Count between A to z:"+  ct);
		
		
		System.out.println("*********Consonant between A to z**********");
	ct=0;
          for ( char c1='a'; c1 <= 'z'; c1++) {
			if(!((c1=='a')||(c1=='e')||(c1=='i')||(c1=='o')||(c1 =='u'))){
			System.out.println("Consonant is :"+ c1);
			++ct;
			}
	}
          System.out.println("Consonant Between A to Z:"+ ct);
		}

}
