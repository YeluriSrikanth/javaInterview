package java8;

public class RunnableWithLambda {

    public static void main(String[] args) {
        Runnable r=()->{
            for(int i=1;i<10 ;i++){
                System.out.println(Thread.currentThread().getName());


            }
        };
        Thread t1=new Thread(r);
        t1.start();Thread t2=new Thread(r);
        t2.start();
    }
}
