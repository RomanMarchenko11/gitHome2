package concurrency.partTwo;

import patterns.proxy.Schedule;

import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {
                System.out.println("Task Executor by " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }

    public static void schedule() {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);
        schedule.schedule(() -> {
            System.out.println("Task executed after 3 seconds");
        }, 3, TimeUnit.SECONDS);
        schedule.scheduleAtFixedRate(() -> {
            System.out.println("Repeating task");
        }, 2, 5, TimeUnit.SECONDS);

    }

    public static void forJoinPool() {
        ForkJoinPool pool = new ForkJoinPool();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SumTask task = new SumTask(array, 0, array.length);
        int result = pool.invoke(task);
        System.out.println("Sum: " + result);
        pool.shutdown();
    }

    static class SumTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start;
        private final int end;

        SumTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= 2) {
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += array[i];
                }
                return sum;
            } else {
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(array, start, mid);
                SumTask rightTask = new SumTask(array, mid, end);
                leftTask.fork(); //запустити ліве підзавдання асинхронно
                return rightTask.compute() + leftTask.compute();
            }
        }
    }
}
