package streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample
{

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().filter(i->i%3==0).forEach(t->System.out.print(t));
    }
}
