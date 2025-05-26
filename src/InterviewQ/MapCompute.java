package InterviewQ;

import java.util.HashMap;
import java.util.Map;

public class MapCompute {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");
        map.put("Pan", "kuku");
        map.putIfAbsent("Pan", "srikanth");

        // Print the map
        System.out.println("Map: " + map);


        map.compute("Name", (key, val)
                -> val.concat(" Singh"));
        map.compute("Address", (key, val)
                -> val.concat(" West-Bengal"));

       // map.compute("key", (key, value) -> value.concat(", nhjfuhdsui"));


        // print new mapping
        System.out.println("New Map: " + map);
    }
}
