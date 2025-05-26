package java8;

import javax.xml.stream.XMLInputFactory;

public class LambdaExample {
    public static void main(String[] args) {

        Math m = (n) -> {
            return n * n;

        };
System.out.println(m.squre(10));
    }
}
interface Math{
    public int squre(int b);
}
//class MathImpl implements  Math{
//
//
//    @Override
//    public int squre(int n) {
//        return n*n;
//    }
//}

