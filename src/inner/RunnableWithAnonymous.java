package inner;

public class RunnableWithAnonymous {
    public static void main(String[] args) {
//        Thread t=new Thread() {
//            public void run() {
//                for (int i = 1; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + "....." + i);
//
//                }
//            }
//        }
        Runnable t=new Runnable() {
            @Override
            public void run() {
          for (int i=0;i<100;i++){
              System.out.println(i);
          }
            }
        };
            for(int j=1;j<10;j++){
                System.out.println(Thread.currentThread().getName()+"....."+j);

            }

            t.run();


    }
}
