package Programs_for_interview;

public class swap_2_numbers {
	
	public static void swap_num_swap_num_with_3rd() {
		int a = 10;
		int b= 20;
		int temp= a;
		a=b;
		b=temp;
		System.out.println("value of a : "+a + ", value of b : "+b);
	}
	
	
	public static void swap_num_swap_num_without() {
		int a = 10;
		int b= 20;
		
		a= a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("value of a : "+a + ", value of b : "+b);
	}
	
	
	public static void main(String[] args) {
		swap_num_swap_num_with_3rd();
	}
}
