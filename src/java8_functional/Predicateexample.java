package java8_functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Predicateexample {
    public static void main(String[] args) {
        List<Integer> list= Stream.of(1,2,34,50,90,23).toList();
        Predicate<Integer> p=t->t%2==0;
        for(int x:list){
            if(p.test(x)){
            System.out.println(x);}

        }


    }
}
