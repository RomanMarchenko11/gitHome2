package concurrency.partTwo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class WithAtomic {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private static AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");

    public static void main(String[] args) throws InterruptedException{
        atomicInteger();
        atomicReference();
    }

    public static void atomicInteger() throws InterruptedException {
        Thread t1 = new Thread(() -> {
           for (int i = 0; i < 1000; i++) {
               counter.incrementAndGet(); //атомарно збільшує значення на 1
           }
        });
        Thread t2 = new Thread(() -> {
           for (int j = 0; j < 1000; j++) {
               counter.incrementAndGet();
           }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final counter value: " + counter.get());
    }

    public static void atomicReference() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
           String previousValue = atomicReference.getAndSet("New Value 1"); //атомарно отримує поточне значення і встановлює нове
            System.out.println(previousValue);
        });
        Thread thread2 = new Thread(() -> {
           String previusValue = atomicReference.getAndSet("New Value 2");
            System.out.println(previusValue);
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final Counter Value: " + atomicReference);
    }
}
