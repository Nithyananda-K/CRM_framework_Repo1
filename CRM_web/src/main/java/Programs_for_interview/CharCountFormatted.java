package Programs_for_interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountFormatted {

	public static void main(String[] args) {
		String str = "madanam";
		LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();

		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}

		StringBuilder result = new StringBuilder();
		
		for(Map.Entry<Character, Integer>  entry : countMap.entrySet()) {	
			result.append(entry.getKey()).append(entry.getValue());
		}
		
		System.out.println(result);
	}
}

//A Map stores key-value pairs. entrySet() returns a Set of Map.Entry<K, V> objects, allowing iteration over keys and values.
