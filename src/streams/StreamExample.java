package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,0,1);
       // Collections.sort(list);
        list.stream().sorted();
        System.out.println(list);
    }
}
