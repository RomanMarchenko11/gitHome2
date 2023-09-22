package concurrency.practice;

import java.util.concurrent.atomic.AtomicInteger;

/*
4
у нас є додаток, в якому декілька потоків збільшують значення цілочисельної змінної на певну кількість разів.
Ми хочемо підрахувати загальну суму збільшень змінної за всі потоки.
 */
public class FifthSum {
    private static final int THREAD_COUNT = 5;
    private static final int ICREMENTS_PER_THREAD = 1000;
    private static final AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i] = new Thread(new IncrementWorker());
            threads[i].start();
        }

        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total increments: " + counter.get());
    }

    static class IncrementWorker implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < ICREMENTS_PER_THREAD; i++) {
                counter.incrementAndGet();
            }
        }
    }
}
