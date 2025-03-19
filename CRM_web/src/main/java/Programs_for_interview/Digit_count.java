package Programs_for_interview;

public class Digit_count {
	
	public static void count_by_for() {
		int no = 1234512;
        int count;

        for (count = 0; no != 0; count++) {
            no = no / 10;
        }
        System.out.println("Find Number of digits using for loop: " + count);
    }
		
	public static void count_by_While() {
		int no = 1234512;
		int count= 0;

		while(no!=0) {
			no= no/10;
			count++;
		}
        System.out.println("Find Number of digits using for While-loop: " + count);
	}
	
	
	public static void main(String[] args) {
//		count_by_for();
		count_by_While();
	}
}