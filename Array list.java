 

1. Create, Add, Remove, and Access Elements in an ArrayList:

import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Accessing elements
        System.out.println("First element: " + list.get(0));

        // Removing an element
        list.remove("Banana");

        // Display the updated list
        System.out.println("Updated list: " + list);
    }
}

2. Using ArrayList to Store and Display Elements:

import java.util.ArrayList;

public class ArrayListStoreDisplay {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Displaying elements using a loop
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

3. Using HashSet to Store Unique Elements and Handle Duplicates:

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements (duplicates will be ignored)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate, will not be added

        // Displaying elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

4. **Using HashMap to Store Key

