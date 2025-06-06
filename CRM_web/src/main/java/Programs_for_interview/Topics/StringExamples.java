package Programs_for_interview.Topics;

public class StringExamples {

	public static void mainpulation() {

		// Manipulation
		String str = "  Abcd  ";
		str.toUpperCase(); // ABCD
		str.toLowerCase(); // abcd
		str.concat("#"); // Abcd#
		str.replace("b", "-"); // A-cd
		System.out.println(str.trim()); // Abcd

		String name = "Nith";
		char[] chars = name.toCharArray(); // store as ch array {'N', 'i', 't', 'h'}
		System.out.println(chars); // Output: Nith

	}

	public static void information() {	
		//Information
		String str = "abcd";

		str.charAt(2);                   // c
		str.indexOf("a");                // 0
		str.indexOf("z");                // -1
		str.length();                    // 4
		str.toString();                  // abcd
		str.substring(2);                // cd
		str.substring(2, 3);             // c
		str.contains("c");               // true
		str.endsWith("d");               // true
		str.startsWith("a");             // true
		str.isEmpty();                   // false
		Integer num = 123;               // Wrapper class
		num.toString();                  // 123

	}
	
	
	public static void stringBuilder() {
		// StringBuilder 
		
		StringBuilder sb = new StringBuilder("Hello");
		
        sb.append(" World");               // Hello World
        sb.insert(5, ",");                 // Hello, World
        sb.replace(0, 5, "Hi");            // Hi, World
        sb.deleteCharAt(2);               // Hi World
        sb.reverse();                      // dlroW iH

        System.out.println(sb.toString()); // Output
	}
	

	public static void main(String[] args) {
		String str1 = "KGF";
		String str2 = new String("Kantara");
		String str3 = String.valueOf(123);
		System.out.println(str1); // KGF
		System.out.println(str2); // Kantara
		System.out.println(str3); // 123

		// Concatenation
		String a = 3 + "str" + 3; // 3str3
		String b = 3 + 3 + "str"; // 6str
		String c = "3" + 3 + "str"; // 33str
		String d = "3" + "3" + "23"; // 3323
		String e = "" + 3 + 3 + "23"; // 3323
		int s = 3 + 3 + 23; // 29

		// Comparison
		String s1 = new String("QuickRef");
		String s2 = new String("QuickRef");

		System.out.println(s1 == s2); // false (different objects)
		System.out.println(s1.equals(s2)); // true (same content)

		System.out.println("**********");
		mainpulation();
	}
}