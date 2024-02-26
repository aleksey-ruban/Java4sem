package unit4;

import java.util.concurrent.Future;

public class Unit4 {

    public static void main(String[] args) {
        MyExecutorService exService = new MyExecutorService(2);

        Future f = exService.submit(() -> {
            try {
                Thread.sleep(20000);
                System.out.println("20 seconds sleep");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        exService.submit(() -> {
            try {
                Thread.sleep(4000);
                System.out.println("4 seconds sleep");
                f.cancel(true);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        exService.submit(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("3 seconds sleep");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        exService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("2 seconds sleep");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        exService.shutdown();

    }
}
