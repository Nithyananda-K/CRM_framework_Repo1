package Programs_for_interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Unique_Character {
	public static void main(String[] args) {
		String str = "animation";
		Map<Character, Integer> charCount = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		System.out.println(charCount);

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue()  >1) {                                                    // > 1 will give duplicate characters 
				System.out.println("First unique character: " + entry.getKey());     
				break;                                                                    // if need all the character remove break    
			}
		}
	}
}

