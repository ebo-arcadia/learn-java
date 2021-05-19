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

class hashMap_methods {
    public static void main(String[] args) {
        HashMap<String, Integer> missionHash = new HashMap<String, Integer>();
        missionHash.put("smooth", 6);
        missionHash.put("wealth", 8);
        missionHash.put("luck", 9);
        missionHash.put("death", 4);
        missionHash.put("crazy", 2);
        System.out.println("Mission hash contains 'smooth'? " + missionHash.containsKey("smooth"));
        System.out.println("All keys in the mission hash is: " + missionHash.keySet());
        System.out.println("All values in the mission hash is: " + missionHash.values());
        System.out.println("Is mission hash empty? " + missionHash.isEmpty());
    }
}