package java8_functional;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c=s->System.out.println(s);
        String[] s={"srikanth","samantha","aparna"};
        for (String v:s){
            c.accept(v);
        }
    }
}
