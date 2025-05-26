package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapExample
{
    public static void main(String[] args) {
        Stream<Integer> list= Stream.of(1,2,3,4,5);

      String res= list.map(String::valueOf).map(i->i).collect(Collectors.joining());
      System.out.println(res);

    }


}
