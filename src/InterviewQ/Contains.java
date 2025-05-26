package InterviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contains {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<Integer> list=Arrays.asList(1,2,3,4);
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");
        List<Integer> list1=new ArrayList<>();
int ar[]=list.stream().mapToInt(Integer::intValue).toArray();
System.out.println(Arrays.toString(ar));
List<Integer> rr= Arrays.stream(ar).boxed().toList();
System.out.println(rr);


        HashMap<String, Long> map = (HashMap<String, Long>) stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(String query:queries){
           list1.add((int)(map.get(query)!=null?map.get(query):0));

        }

    }
}
