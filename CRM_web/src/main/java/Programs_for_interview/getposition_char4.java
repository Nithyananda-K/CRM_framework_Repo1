package Programs_for_interview;

import java.util.ArrayList;

public class getposition_char4 {

	public static void main(String[] args) {
		String str = "I am samuel";
		int count = 0;
		ArrayList<Integer> position = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a') {
				count++;
				position.add(i);
			}
		}
		System.out.println(position + "count of char" + count);
	}
}
