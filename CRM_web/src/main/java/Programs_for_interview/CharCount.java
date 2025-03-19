package Programs_for_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCount {

	public static void main(String[] args) {
		String str = "automation";
		HashMap<Character, Integer> countMap = new HashMap<>();

		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}

		System.out.println(countMap);

	}
}
