package collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample extends Thread {
    ConcurrentHashMap<Integer, String> map =  new ConcurrentHashMap<>();

    public static void main(String[] args) {
        HashMapExample t1 = new HashMapExample();
        t1.start();
        HashMapExample t2 = new HashMapExample();
        t2.start();


    }

    public void run() {
        for (int i = 1; i < 1000000; i++) {
            System.out.println(map.put(i, "rama") + "....." + Thread.currentThread().getName());


        }
        System.out.println(map.size());


    }

}
