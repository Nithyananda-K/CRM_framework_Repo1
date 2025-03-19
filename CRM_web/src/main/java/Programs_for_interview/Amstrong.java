package Programs_for_interview;

public class Amstrong {

	public static void main(String[] args) {

		int no = 153;
		int temp = 0;
		int copy = no;

		while (no != 0) {
			int digit = no % 10;
			temp = temp + (int) Math.pow(digit, 3);
			no = no / 10;
		}

		if (copy == temp) {
			System.out.println("no is amstrong");
		} else {
			System.out.println("no is not amstrong");
		}
	}
}
