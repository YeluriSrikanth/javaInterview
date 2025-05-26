package concurreny;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
        list.add(12);
        list.add(13);
        list.add(3);
        list.add(2);
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            int n=itr.next();
            if(n==3){
               list.remove(3);

            }
            //System.out.println(itr.next());

        }
        System.out.println(list);
    }
}
