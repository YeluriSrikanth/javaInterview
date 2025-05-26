package java8_functional;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> s=()->"this is supplier";
        System.out.println(s.get());
    }
}
