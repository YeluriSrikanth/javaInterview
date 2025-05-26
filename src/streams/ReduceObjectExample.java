package streams;

import java.util.stream.Stream;

public class ReduceObjectExample {
    static class Sale{
        String item;
        double price;
        Sale(String item,double price){
            this.item=item;
            this.price=price;
        }


    }

    public static void main(String[] args) {
       Stream<Sale> sales=Stream.of(new Sale("tv",120000),
               new Sale("refr",10000),
               new Sale("chair",3000)
       );
      Double res = sales.reduce(0.0,(sum, sale) -> sum + sale.price,Double::sum);
      System.out.println(res);
    }
}
