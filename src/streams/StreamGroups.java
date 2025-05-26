package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroups {
    public static void main(String[] args) {
        List<String> list= Stream.of("apple","banana","abcde","abcde","me").toList();

       Map<Integer,Long> res= list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));


       list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));


       int ans=list.stream().max(Comparator.comparing(String::length)).get().length();

       List<Integer> integerList= Arrays.asList(3,56,4,8,1);
       int max=integerList.stream().max(Comparator.comparing(Integer::intValue)).get();
       System.out.println(max);
String maxLength=list.stream().max(Comparator.comparing(String::length)).get();

       System.out.println(maxLength);
    }
}
