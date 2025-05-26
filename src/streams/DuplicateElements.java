package streams;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        int ar[]={2,6,9,12,56,3,2,7,4,8,9,2,2};
     //  long result= Arrays.stream(ar).filter(i->i==2).count();
       //System.out.println(result);
//       Map<Integer,Long> map= Arrays.stream(ar).boxed()
//               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Long res=Arrays.stream(ar).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .get(2);
        System.out.println(res);

    }

}
