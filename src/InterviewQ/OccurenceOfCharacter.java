package InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String s="srikanthsrika";
        String [] ar=s.split("");
      List<String> list= Arrays.stream(ar).
               collect(Collectors.groupingBy(Function.identity(),
                       Collectors.counting())).entrySet().stream().
              filter(i->i.getValue()>1).map(t->t.getKey()).toList();

      System.out.println(list);
    }

}
