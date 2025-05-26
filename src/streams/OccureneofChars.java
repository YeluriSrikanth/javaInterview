package streams;

import java.util.Arrays;
import java.util.List;

public class OccureneofChars {

    public static void main(String[] args) {
        List<String> list=Arrays.asList("apple","oxe","aman","app");
       long res= list.stream()
              // .map(String::toUpperCase)
               .flatMapToInt(String::chars)
                .filter(ch->ch=='a')
                .count();
       System.out.println(res);
    }
}
