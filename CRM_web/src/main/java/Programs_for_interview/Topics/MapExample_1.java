package Programs_for_interview.Topics;
import java.util.HashMap;
import java.util.Map;

public class MapExample_1 {
    public static void main(String[] args) {
        Map<String, String> testData = new HashMap<>();

        // put entries
        testData.put("username", "admin");
        testData.put("password", "admin123");
        testData.put("url", "https://example.com");

        // get
        System.out.println("URL: " + testData.get("url"));                           // URL: https://example.com

        // containsKey
        System.out.println("Has key 'username': " + testData.containsKey("username"));     // Has key 'username': true

        // size
        System.out.println("Total entries: " + testData.size());                    // Total entries: 3

        // keySet
        System.out.println("All keys:");
        for (String key : testData.keySet()) {
            System.out.println(key);                                                // password, username, url
        }

        // entrySet
        System.out.println("All key-value pairs:");
        for (Map.Entry<String, String> entry : testData.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());          // password = admin123 ...
        }

        // clear
        testData.clear();
        System.out.println("Map is empty after clear(): " + testData.isEmpty());    // Map is empty after clear(): true
    }
}


