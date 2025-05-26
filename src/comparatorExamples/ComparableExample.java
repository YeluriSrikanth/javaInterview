package comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {//implements Comparable<Integer> {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("42");
        list.add("53");
        list.add("1");

Collections.sort(list);
System.out.println(list);
    }


//    public int compareTo(Integer o) {
//        System.out.println("compareTo");
//        return o.intValue()-o.intValue();
//    }
}
