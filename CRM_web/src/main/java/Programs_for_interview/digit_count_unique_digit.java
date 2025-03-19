package Programs_for_interview;

import java.util.HashSet;

public class digit_count_unique_digit {

	public static int countDigits() {
		int no = 3366;
		HashSet<Integer> uniqueDigits = new HashSet<>();

		while (no != 0) {
			int digit = no % 10; // Extract last digit
			uniqueDigits.add(digit); // Add it to the set
			no = no / 10; // Remove last digit
		}
		System.out.println(uniqueDigits);
		return uniqueDigits.size(); // Return the count of unique digits
	}

	public static int countUniqueCharacters() {
		String str = "hello";
		HashSet<Character> uniqueChars = new HashSet<>();

		for (char ch : str.toCharArray()) {
			uniqueChars.add(ch); // Add character to the set
		}
		System.out.println(uniqueChars);
		return uniqueChars.size(); // Return the count of unique characters
	}

	public static void main(String[] args) {
//		System.out.println("Unique digit count: " + countDigits()); // Output: 2

		System.out.println("Unique character count: " + countUniqueCharacters()); // Output: 4
		System.out.println(countDigits());
	}
}
