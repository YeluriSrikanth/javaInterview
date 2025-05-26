package streams;

import com.sun.source.tree.InstanceOfTree;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        List<Object> list= Arrays.asList("sri",1,3,6,8,9);


      int ress= list.stream().filter(var ->var instanceof Integer)
              .map(i->(int)i).reduce(0,(a,b)->(a+b));
      System.out.println(ress);

       int s= list.stream().filter(var ->var instanceof Integer).map(e->(int) e).
                map(x->x*x).reduce(1,(a,b)->a+b);
             // .forEach(t->System.out.print(" "+t));
       int res= list.stream().filter(var ->var instanceof Integer).map(e->(int) e).
                map(x->x+x).reduce(1,(b,ca)->b+ca);
      System.out.println(res);
    }

}
