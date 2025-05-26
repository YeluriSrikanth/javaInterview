package InterviewQ;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxValueInHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("ram",1000);
        map.put("mari",3000);
        map.put("pari",5000);
        map.put("luno",6000);
        map.put("sam",99000);

      List<Integer> res=  map.entrySet().stream().sorted(Map.Entry.comparingByValue())
              .map(t->t.getValue())
                .collect(Collectors.toList());

      System.out.println(res);

    }

}
