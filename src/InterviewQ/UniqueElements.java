package InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElements {
    public static void main(String[] args) {
        String s="srikanthsri";
        List<String> list=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(t->t.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(list);


    }
}
