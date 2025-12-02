package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EvenOddExecutorService {

    public static final int n=100;
    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> f1 = executorService.submit(() -> {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        });
        try {
            f1.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        Future<?> f2 = executorService.submit(() -> {

            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        });


        try {
            f2.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        executorService.shutdown();

        System.out.println("main end");

    }


}
