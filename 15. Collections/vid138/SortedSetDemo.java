import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        // Create a SortedSet using TreeSet
        SortedSet<String> fruits = new TreeSet<>();

        // Add elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");

        // Attempt to add a duplicate
        fruits.add("Apple");  // Won't be added

        // Print the SortedSet
        System.out.println("SortedSet: " + fruits);

        // First and Last Elements
        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        // HeadSet - elements less than "Mango"
        System.out.println("HeadSet (less than Mango): " + fruits.headSet("Mango"));

        // TailSet - elements greater than or equal to "Mango"
        System.out.println("TailSet (from Mango): " + fruits.tailSet("Mango"));

        // SubSet - elements between "Banana" (inclusive) and "Mango" (exclusive)
        System.out.println("SubSet (Banana to Mango): " + fruits.subSet("Banana", "Mango"));

        // Underlying sorting order
        System.out.println(fruits.comparator());
    }
}
