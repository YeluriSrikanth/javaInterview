package InterviewQ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",23);
        map.put("B",83);
        map.put("C",3);
       List<Integer> list=
               map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(t->t.getValue()).toList();

System.out.println(list);


map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t->System.out.println(t));





        List<Integer> res1=  map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .map(t->t.getValue())
                .collect(Collectors.toList());

    }
}
