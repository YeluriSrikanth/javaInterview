package threads;

public class RunnableExample implements Runnable {


    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());

        }
    }

    public static void main(String[] args) {
        RunnableExample obj1=new RunnableExample();
        Thread t1=new Thread(obj1);
        t1.start();
        RunnableExample obj2=new RunnableExample();
        Thread t2=new Thread(obj2);
        t2.start();
    }
}
