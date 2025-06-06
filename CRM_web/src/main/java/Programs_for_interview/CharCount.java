package Programs_for_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCount {

	public static void main(String[] args) {

		String str = "Galaxyg";

		HashMap<Character, Integer> charcount = new HashMap<>();

		for (char ch : str.toCharArray()) {
			charcount.put(ch, charcount.getOrDefault(ch, 0) + 1);
		}

		System.out.println(charcount);

//		StringBuilder result = new StringBuilder();
//
//		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
//			result.append(entry.getKey()).append(entry.getValue());
//		}
//		System.out.println(result);
	}
}