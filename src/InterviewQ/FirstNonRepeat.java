package InterviewQ;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeat {
    public static void main(String[] args) {
        int ar[]={1,2,3,1,5,2,4,6,3,8};
      int res=  Arrays.stream(ar).boxed().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1).map(Map.Entry::getKey).findFirst().get();
      System.out.println(res);
    }
}
