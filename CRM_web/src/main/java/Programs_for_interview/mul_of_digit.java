package Programs_for_interview;

public class mul_of_digit {
	
	public static void mul_of_digit_by_while() {
		int value= 145;
		int multi= 1;
		
		while(value!=0) {
			multi= multi * (value % 10);
			value = value/10;
		}
		System.out.println(multi);
	}
	
	public static void mul_of_digit_by_for() {
		int value= 145;
		int multi= 1;
		
		for(; value!=0; value/= 10) {
			multi = multi*(value % 10);
		}
		System.out.println(multi);
	}
	
	public static void main(String[] args) {
		mul_of_digit_by_while();
		mul_of_digit_by_for();
	}
}
