package concurrency.partTwo;

public class ThreadLocalExample {
    private static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() -> {
       "Initial Value"
    });

    public static void main(String[] args) {
        new Thread(() -> {
           threadLocal.set("Thread 1 Value");
           printThreadValue();

        }).start();
        new Thread(() -> {
            threadLocal.set("Thread 2 Value");
            printThreadValue();
        }).start();

        printThreadValue();

    }

    private static void printThreadValue() {
        System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get());
    }
}
