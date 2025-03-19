package Programs_for_interview;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Prime numbers from 1 to 10:");
//		int no = 11;
//		System.out.println(Math.sqrt(no));
		
		for( int no = 1; no<=10; no++) {             
			 boolean isprime = true;
			
			 if(no<=1) {
				 isprime = false;
			 }else {
				 
				 for(int i = 2; i<=Math.sqrt(no); i++ ) {
					 if(no%i == 0) {
						 isprime = false;
						 break;
					 }
				 }
			 }
			 if(isprime) {
				 System.out.println(no+ "" + " no is prime");
			 }else {
				 System.out.println(no+ "" + " no is not prime");
			}
		}
	}
}
