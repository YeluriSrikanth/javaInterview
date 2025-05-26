package InterviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListFromArray {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        int ar[]={1,5,6,78,9};

        list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.stream(ar).boxed().collect(Collectors.toList());
    }
}
