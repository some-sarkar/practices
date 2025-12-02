package Thread;

public class EvenOdd {
    public static final int n=100;
    public static void main(String[] args){


        Thread t1 = new Thread(()->{

            for(int i=1; i<=n; i++){
                if(i%2==0)
                    System.out.println(i);
            }

        });


        Thread t2 = new Thread(()->{

            for(int i=1; i<=n; i++){
                if(i%2!=0)
                    System.out.println(i);
            }

        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main end");

    }


}
