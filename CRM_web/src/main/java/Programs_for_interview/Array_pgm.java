package Programs_for_interview;

public class Array_pgm {

	public static void arrint() {
		
//		int[] numbers= {10,20,30,40,50,};  initialize in one line 
		int[] numbers = new int[5];
		
		numbers[0]= 10;
		numbers[1]= 20;
		numbers[2]= 30;
		numbers[3]= 40;
		numbers[4]= 50;
		
		// print the numbers of array using for each loop 
		for(int num: numbers) {
			System.out.println(num);
		}
		System.out.println("****************");
		// print the numbers of array using for each loop 
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
	}
		
	
	public static void arrstring() {
		String[] str= new String[4];
	}
	
	
	public static void main(String[] args) {
		arrint();
	}
	
}
