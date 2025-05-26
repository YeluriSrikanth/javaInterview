package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService es= Executors.newFixedThreadPool(2);
        Task[] task=new Task[4];
        for(int i=0;i<4; i++){
            task[i]=new Task(i);
            es.execute(task[i]);

        }

    }
}
class Task implements Runnable{
    int t;
Task(int t){
    this.t=t;
}

    @Override
    public void run() {
for(int i=0;i<=100;i+=2){
    String name=Thread.currentThread().getName();
    System.out.println(name+" "+t);
//    try{
//        Thread.sleep(100);
//    } catch (InterruptedException e) {
//       // throw new RuntimeException(e);
//    }

}



    }
}