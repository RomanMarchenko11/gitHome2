package concurrency.practice;

import java.util.concurrent.CountDownLatch;
/*
3 CountDownLatch / ThreadLocal
у нас є багатопоточний додаток, який обробляє певну кількість завдань,
і ми хочемо виміряти час, який кожен потік витратив на обробку своєї частини завдань.
 */
public class FourthTaskManager {
    private static final int THREAD_COUNT = 3;
    private static final int TASK_PER_THREAD = 5;
    private static final CountDownLatch latch = new CountDownLatch(THREAD_COUNT);
    private static final ThreadLocal<Long> processingTime = ThreadLocal.withInitial(System::currentTimeMillis);

    public static void main(String[] args) {
        for (int i = 0; i <THREAD_COUNT; i++) {
            new Thread((new TaskWorker((i + 1) * TASK_PER_THREAD, (i + 3) * TASK_PER_THREAD))).start();
        }
        try {
            latch.await(); // wait for all threads to finish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work was done by all threads");
    }

    static class TaskWorker implements Runnable {
        private final int startTask;
        private final int endTask;
        public TaskWorker(int startTask, int endTask) {
            this.startTask = startTask;
            this.endTask = endTask;
        }
        @Override
        public void run(){
            long startTime = System.currentTimeMillis();
            for (int task = startTask; task < endTask; task++) {
                System.out.println("Thread " + Thread.currentThread().getId() + " is processing task");
            }

            long endTime = System.currentTimeMillis();
            long howlongTime = endTime - startTime;

            processingTime.set(howlongTime);
            latch.countDown();
        }
    }
}
