// hash map
// designates unique key to corresponding value (key value pair) can be retrieved at any given time

import java.util.HashMap;
import java.util.Map;

class java_hashmap {
    public static void main(String[] args) {
        Map<String, String> objOfMap = new HashMap<String, String>();
        objOfMap.put("Name", "Ebo");
        objOfMap.put("Goal", "Become a good developer");
        objOfMap.put("Love", "God");
        objOfMap.put("Truth", "Justice");
        System.out.println(objOfMap.get("Love"));
        System.out.println("All key-value pairs / elements in this hash: ");
        System.out.println(objOfMap);
    }
}

// how to remove a value from HashMap based on key?
// import java.util.*;  
class remove_value_from_hash {
    public static void main(String[] args) {
        // create & populate hash map
        HashMap<Integer, String> weirdHash = new HashMap<Integer, String>();
        weirdHash.put(1, "apple");
        weirdHash.put(2, "orange");
        weirdHash.put(3, "mellon");
        weirdHash.put(4, "rose");
        weirdHash.put(5, "the boyzzz");
        System.out.println("current hash is: " + weirdHash);
        weirdHash.remove(5);
        System.out.println("hash after removal: " + weirdHash);
    }
}