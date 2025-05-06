package Programs_for_interview;

public class do_While {

	public static void main(String[] args) {

		int i = 1;
		do {
			System.out.println("hi");
			i++;
		} while (i <= 5);

		int no = 123;
		int rev = 0;
		do {
			int digit = no % 10;
			rev = (rev * 10) + digit;
			no = no / 10;
		} while (no > 0);

		System.out.println(rev);

		int n = 1;
		while (n <= 5) {
			System.out.println("hello");
			n++;
		}
	}

}
