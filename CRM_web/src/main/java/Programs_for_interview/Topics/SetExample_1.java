package Programs_for_interview.Topics;

import java.util.HashSet;
import java.util.Set;

public class SetExample_1 {
    public static void main(String[] args) {
        Set<String> windowHandles = new HashSet<>();

        // add handles (duplicates ignored)
        windowHandles.add("home");
        windowHandles.add("cart");
        windowHandles.add("cart"); // duplicate will ignore

        // size
        System.out.println("Total unique handles: " + windowHandles.size());           // Total unique handles: 2

        // contains
        System.out.println("Contains 'cart': " + windowHandles.contains("cart"));      // Contains 'cart': true

        // iterate using for-each
        for (String handle : windowHandles) {
            System.out.println(handle);                                                // cart, home 
        }

        // remove
        windowHandles.remove("cart");
        System.out.println("After removing 'cart': " + windowHandles);                 // After removing 'cart': [home]

        // clear
        windowHandles.clear();
        System.out.println("Set is empty after clear(): " + windowHandles.isEmpty());  //Set is empty after clear(): true
    }
}
