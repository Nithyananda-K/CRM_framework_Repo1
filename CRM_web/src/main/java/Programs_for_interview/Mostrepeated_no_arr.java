package Programs_for_interview;

import java.util.HashMap;

public class Mostrepeated_no_arr {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 2, 4, 4 };
		int nocount = 0;
		int number = 0;

		HashMap<Integer, Integer> freqno = new HashMap<>();
		
		for (int no : arr) {
			freqno.put(no, freqno.getOrDefault(no, 0) + 1);
			
			if (freqno.get(no) > nocount) {
				nocount = freqno.get(no);
				number = no;
			}
		}
		System.out.println(number + " " + "no of times " + nocount);

	}
}
