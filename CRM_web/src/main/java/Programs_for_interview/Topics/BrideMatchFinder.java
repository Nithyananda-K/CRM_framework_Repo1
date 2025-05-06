package Programs_for_interview.Topics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BrideMatchFinder {
	public static void main(String[] args) {
		// Compatible Nakshatra and their starting letters for a Scorpio-Anuradha groom
		// Compatible Nakshatra and their starting letters for a Scorpio-Anuradha groom
		Map<Integer, String> nakshatraMap = new HashMap<>();
		nakshatraMap.put(1, "Rohini");
		nakshatraMap.put(2, "Uttara Phalguni");
		nakshatraMap.put(3, "Swati");
		nakshatraMap.put(4, "Mrigashira");
		nakshatraMap.put(5, "Chitra");
		nakshatraMap.put(6, "Hasta");

		Map<String, String[]> compatibleNakshatras = new HashMap<>();
		compatibleNakshatras.put("rohini", new String[] { "o", "va", "vi", "vu" });
		compatibleNakshatras.put("uttara phalguni", new String[] { "te", "to" });
		compatibleNakshatras.put("swati", new String[] { "ru", "re", "ro", "taa" });
		compatibleNakshatras.put("mrigashira", new String[] { "ve", "vo", "ka", "ki" });
		compatibleNakshatras.put("chitra", new String[] { "pe", "po", "ra", "ri" });
		compatibleNakshatras.put("hasta", new String[] { "pu", "sha", "na", "tha" });

		Scanner scanner = new Scanner(System.in);

		// Taking input for bride's name
		System.out.print("Enter the Bride's Name: ");
		String brideName = scanner.nextLine().trim().toLowerCase(); // Convert to lowercase

		// Display Nakshatra options
		System.out.println("\nSelect the Bride's Nakshatra:");
		for (Map.Entry<Integer, String> entry : nakshatraMap.entrySet()) {
			System.out.println(entry.getKey() + ". " + entry.getValue());
		}

		System.out.print("Enter your choice (1-6): ");
		int choice = scanner.nextInt();
		scanner.close();

		// Validate input
		if (!nakshatraMap.containsKey(choice)) {
			System.out.println("❌ Invalid choice! Please select a valid Nakshatra.");
			return;
		}

		// Get Nakshatra name from the number choice
		String brideNakshatra = nakshatraMap.get(choice).toLowerCase();

		// Extract first 1 or 2 letters from the name
		String firstLetter = brideName.substring(0, Math.min(2, brideName.length())).toLowerCase();

		// Checking compatibility
		if (compatibleNakshatras.containsKey(brideNakshatra)) {
			for (String letter : compatibleNakshatras.get(brideNakshatra)) {
				if (firstLetter.startsWith(letter.toLowerCase())) {
					System.out.println("\n✅ Matching Bride Name & Nakshatra!");
					return;
				}
			}
		}

		System.out.println("\n❌ Not a Matching Bride Name & Nakshatra.");
	}
}