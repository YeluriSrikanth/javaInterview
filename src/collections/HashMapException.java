package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapException {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            if(entry.getKey()==3){
                map.put(entry.getKey(), entry.getValue()+"srikanth");
                map.put(56,"jhdhf");

            }

        }System.out.println(map);

    }
}
