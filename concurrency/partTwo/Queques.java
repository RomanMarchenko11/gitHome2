package concurrency.partTwo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Queques {
    public static void main(String[] args) {

    }
    public static void blockingQueque() {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Consumer
        new Thread(() -> {
           try {
               for (int i = 0; i < 20; i++) {
                   int value = queue.take();
                   System.out.println("Consumed: " + value);
                   Thread.sleep(150);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }).start();
    }

    private static void syncQueque() {
        SynchronousQueue<Integer> queue =new SynchronousQueue();
        new Thread(() -> {
           try {
               for (int i = 0; i < 5; i++) {
                   queue.put(i);
                   System.out.println("Produced: " + i);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }).start();

        //Consumer
        new Thread(() -> {
           try {
               for (int i = 0; i < 5; i++) {
                   int value = queue.take();
                   System.out.println("Consumed: " + value);
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }).start();
    }
}
