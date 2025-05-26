package comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDriver {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1);
        System.out.println(list);
      // Collections.sort(list,(o1,o2)->o2<o1?-1:o2>o1?1:0);
        Comparator<Integer> r=(t1,t2)->{
          return t2<t1?-1:t2>t1?1:0;
        };
        Collections.sort(list,r);
        System.out.println(list);
    }


}
//class MyComparator implements Comparator<Integer>{
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o1<o2?-1:o1>o2?1:0;
//    }
//
//}
