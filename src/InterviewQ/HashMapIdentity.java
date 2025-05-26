package InterviewQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapIdentity {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(12, 12, 3, 45, 3, 6, 81, 23, 34, 45);
        for (int var : list) {
//            if (map.put(var, 1) == null) {
//                map.put(var, 1);
//            } else {
//                map.put(var, map.get(var) + 1);
//            }
//
//        }
           // Integer integer = ((map.put(var, 1)) == null) ? map.put(var, 1) : map.put(var, map.get(var));
        }
        System.out.println(map);

    }
}
