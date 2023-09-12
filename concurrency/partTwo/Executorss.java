package concurrency.partTwo;

import java.util.concurrent.*;

public class Executorss {

    public static void executorService() {
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2); //створюємо пул з двох потоків
        try {
            executorService.submit(() -> {
                System.out.println("Task 1");
            });
            executorService.submit(() -> {
                System.out.println("Task 2");
            });
        } finally {
            executorService.shutdown(); //після виконання завдань завершуємо ExecutorService
        }
    }

    public static void ExecutorCallable() {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(() ->{
            Thread.sleep(1000);
            return 42;
        });
        executor.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ExecutorRunnableAndCallable() {
        ExecutorService es = Executors.newFixedThreadPool(2);
//        Runnable
        Runnable longRunningTask = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Completed long running task.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
//        Callable
        Callable<String> taskWithResult = () -> {
            Thread.sleep(1000);
            return "Result from Callable";
        };

        try {
            es.execute(longRunningTask);
            Future<String> future = es.submit(taskWithResult);
            String result = future.get(); //очікуємо результат
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            es.shutdown();
        }
    }

    public static void CompletableFutureExample() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> 5); //перший асинхронний потік
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> 3); //другий асинхронний потік
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> result1 + result2); //комбінуємо результати двох потоків
        int finalResult = combinedFuture.get(); //отримання комбінованого результату
        System.out.println(finalResult);
    }

    public static void customExecutorService() {
        ExecutorService customExecutor = Executors.newFixedThreadPool(2);
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5, customExecutor);
    }
}
