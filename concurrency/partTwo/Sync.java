package concurrency.partTwo;

import java.util.concurrent.*;

public class Sync {
    private static void CountDownLatch() {
        CountDownLatch latch = new CountDownLatch(2);
        new Thread(() -> {
            System.out.println("Task 1 is running");
            latch.countDown();
        }).start();
        new Thread(() -> {
            System.out.println("Task 2 is running");
            latch.countDown();
        }).start();

        try {
            latch.await(); //головний потік чекає, поки обидва завдання не завершаться
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Both Tasks are done");
    }
    private static void cyclicBarrier(){
        CyclicBarrier barrier = new CyclicBarrier(2, () -> {
            System.out.println("Both tasks reached the barrier");
        });
        new Thread(() -> {
            System.out.println("Task 1 is approaching the barrier");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 1 is passed the barrier");
        }).start();
        new Thread(() -> {
            System.out.println("Task 2 is reached the barrier");
            try {
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private static void semaphore() {
        Semaphore semaphore = new Semaphore(1);
        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Task 1 is running");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }).start();

        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("Task 2 is running");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }).start();
    }
}
