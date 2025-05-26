package InterviewQ;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append('a');
        sb.append('c');
        sb.append('b');
        sb.deleteCharAt(2);
        System.out.println(sb);
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(123);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.remove(1));




    }
}
