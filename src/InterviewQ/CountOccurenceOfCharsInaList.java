package InterviewQ;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfCharsInaList {
    public static void main(String[] args) {
        //  Map<Character,Integer> map =
        String s = Arrays.asList("Amol", "Arun", "Alok", "Adhitya")
                .stream()
                .collect(Collectors.joining()).toString();
        Map<Integer, Long> map =
                s.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

System.out.print(map);
    }
}
