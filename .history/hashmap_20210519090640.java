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
        objOfMap.get("Love");
        System.out.println("All key-value pairs / elements in this hash: ");
        System.out.println(objOfMap);
    }
}