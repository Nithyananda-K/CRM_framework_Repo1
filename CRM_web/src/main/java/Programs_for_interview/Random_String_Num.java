package Programs_for_interview;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Random_String_Num {

	public static int randomInt() {
		Random random = new Random();
		int randomNum = random.nextInt(1000);
		return randomNum;
	}

	public static String randomString() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString = "";
		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			randomString = randomString + chars.charAt(random.nextInt(chars.length()));
		}
		return randomString;
	}

	public static void getSystemDateYYYYDDMM() {

		Date dateobj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateobj);
		System.out.println(date);
	}
	

	public static void java_pgm_get_timestamp1() {

		String time = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
		System.out.println(time); // Example: 2025-03-21_15-52-30
	}

	public static void java_pgm_get_timestamp2() {

		String time = new Date().toString();
//		System.out.println(time); this will give in Thu Feb 20 13:33:24 IST 2025
		String formatTime = time.replace(" ", "_").replace(":", "-");
		System.out.println(formatTime);
	}
	
	public static void main(String[] args) {

//		int randomNum = randomInt();
//		System.out.println(randomNum);
//		String randomString = randomString();
//		System.out.println(randomString);
//		java_pgm_get_timestamp();
//		java_pgm_get_timestamp1();
//		java_pgm_get_timestamp2();
		getSystemDateYYYYDDMM();
	}
}
