package streams;

import java.util.List;
import java.util.stream.Stream;

public class MapAndFMap {
    public static void main(String[] args) {
        Stream<Integer> list= Stream.of(1,2,3,4,5);
        list.map(t-> List.of(t+1,t+2,t+3)).flatMap(e->e.stream()).forEach(v->System.out.print(v));
    }
}
