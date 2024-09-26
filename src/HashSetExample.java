import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        // 1. Append the specified element to the end of a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        System.out.println("HashSet after adding elements: " + hashSet);

        // 2. Iterate through all elements in a HashSet
        System.out.println("Iterating over HashSet elements:");
        for (String element : hashSet) {
            System.out.println(element);
        }

        // 3. Get the number of elements in the HashSet
        int size = hashSet.size();
        System.out.println("Number of elements in HashSet: " + size);

        // 4. Empty the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        // 5. Test if HashSet is empty or not
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        // Adding elements back to demonstrate other operations
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // 6. Clone a HashSet to another HashSet
        HashSet<String> clonedSet = (HashSet<String>) hashSet.clone();
        System.out.println("Cloned HashSet: " + clonedSet);

        // 7. Convert HashSet to an array
        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);
        System.out.println("HashSet converted to array: " + Arrays.toString(array));

        // 8. Convert HashSet to TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("HashSet converted to TreeSet: " + treeSet);

        // 9. Convert HashSet to List/ArrayList
        List<String> arrayList = new ArrayList<>(hashSet);
        System.out.println("HashSet converted to ArrayList: " + arrayList);

        // 10. Compare two HashSets
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Apple");
        anotherSet.add("Banana");
        boolean areEqual = hashSet.equals(anotherSet);
        System.out.println("Are the two HashSets equal? " + areEqual);

        // 11. Compare two sets and retain elements that are the same in both sets
        hashSet.retainAll(anotherSet);
        System.out.println("HashSet after retaining common elements: " + hashSet);

        // 12. Remove all of the elements from the HashSet
        hashSet.clear();
        System.out.println("HashSet after removing all elements: " + hashSet);
    }
}
