package Programs_for_interview.Topics;
import java.util.ArrayList;
import java.util.List;

public class ListExample_1 {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();

        // add elements
        elements.add("Login");
        elements.add("Signup");
        elements.add("Contact");

        // get element
        System.out.println("Element at index 1: " + elements.get(1));                  // Element at index 1: Signup

        // size
        System.out.println("Total elements: " + elements.size());                      // Total elements: 3

        // contains
        System.out.println("Contains 'Signup': " + elements.contains("Signup"));       // Contains 'Signup': true

        // iterate using for-each
        System.out.println("All elements:");
        for (String text : elements) {
            System.out.println(text);                                                  // Login, Signup, Contact
        }

        // remove
        elements.remove("Contact");                                            
        System.out.println("After removing 'Contact': " + elements);             // After removing 'Contact': [Login, Signup]

        // clear
        elements.clear();
        System.out.println("Is list empty after clear(): " + elements.isEmpty());    // Is list empty after clear(): true
    }
}



