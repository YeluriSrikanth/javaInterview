package streams;

import coreJava.Formatter;

import java.util.Arrays;
import java.util.List;

public class MethodreferenceExample {
    public static void main(String[] args) {
        Formatter f=new Formatter();
        List<String> list= Arrays.asList("rama","","kris87%","hare1!","me");

        list.stream().filter(e->!e.isEmpty())
                .filter(e->e!=null)
                .map(f::formatString)
                .map(String::toUpperCase)
                .sorted(String::compareTo)
               .map(People::new)
                .forEach(System.out::println);
    }
}
