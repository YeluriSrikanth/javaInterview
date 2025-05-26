package threads;

public class ThreadExample  extends  Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Thread classs"+Thread.currentThread().getName()+"   i");
        }
    }

    public static void main(String[] args) {
        ThreadExample th=new ThreadExample();
        th.run();
for(int i=1;i<10;i++){
    System.out.println("main threa"+i);

}

    }
}
