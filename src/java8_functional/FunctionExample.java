package java8_functional;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        String[] ar={"sri","rama","krishna","me"};
        Function<String,Integer> r=(s)->s.length();
        for(String var:ar){
            System.out.println(var+" length"+r.apply(var));

        }
    }
}
