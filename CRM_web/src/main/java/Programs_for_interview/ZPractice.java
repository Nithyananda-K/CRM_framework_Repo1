package Programs_for_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class ZPractice {

	static void occurence_all_char() {
		String str = "automation";
		HashMap<Character, Integer> charcount = new HashMap<Character, Integer>();

		for (char ch : str.toCharArray()) {
			charcount.put(ch, charcount.getOrDefault(ch, 0) + 1);
		}
		System.out.println(charcount);
		StringBuilder sb = new StringBuilder();

		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			sb.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(sb);  
	}

	static void occurence_char_in_string() {
		String str = "ananana";
		char letter = 'a';
		int count = 0;

		for (char ch : str.toCharArray()) {
			if (ch == letter) {
				count++;
			}
		}
		System.out.println(count);
	}

	static void uniqcharecter_string() {
		String str = "NithyaNith";

		HashSet<Character> uniquechar = new HashSet<Character>();
		for (char ch : str.toCharArray()) {
			uniquechar.add(ch);
		}
		System.out.println(uniquechar);
	}

	static void WordOccurrence() {
		String sentence = "selenium is automation and selenium is powerful";
		String target = "is";
		int count = 0;

		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words)); // [selenium, is, automation, and, selenium, is, powerful]

		// get the occurence count of word
		for (String word : words) {
			if (word.equals(target)) {
				count++;
			}
		}

		// reverse the sentence
		String revsentence = "";
		for (int i = words.length - 1; i >= 0; i--) {
			revsentence = revsentence + words[i] + " ";
		}
		System.out.println(revsentence);
		System.out.println("word " + target + " repeted no " + count);
	}

	static void sperate_upper_lower_ch() {

		String str = "NMgshMhkdBvf^89$%";
		int count = 0;
		String upper = "";
		String lower = "";
		String spcl = "";

		for (char ch : str.toCharArray()) { // 65 -90 uppercase 97 -122 lower case spcl char
			if (ch >= 'A' && ch <= 'Z') {
				upper += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lower += ch;
			} else {
				spcl += ch;
			}
		}
		System.out.println(upper + " " + lower + " " + spcl);
		System.out.println('a');
	}

	static void mostrepeated_no() {
		int[] arr = { 1, 2, 3, 6, 5, 5, 6, 8, 8 };
		int maxCount = 0;
		int mostRepeated = 0;

		HashMap<Integer, Integer> freqMap = new HashMap<>();

		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

			if (freqMap.get(num) > maxCount) {
				maxCount = freqMap.get(num);
				mostRepeated = num;
			}
		}
		System.out.println(mostRepeated  +"  & its count "+ maxCount);
	}

	public static void main(String[] args) {
//		occurence_char_in_string();
//		occurence_all_char();
//		sperate_upper_lower_ch();
//		uniqcharecter_string();
//		WordOccurrence();
		mostrepeated_no();
	}
}
