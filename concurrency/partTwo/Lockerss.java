package concurrency.partTwo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lockerss {
    private final Lock lock = new ReentrantLock();
    private final Object lockObj = new Object();

    public static void main(String[] args) {
        Lockerss example = new Lockerss();
        Thread thread1 = new Thread(example::doWork);
        Thread thread2 = new Thread(example::doWork);
        thread1.start();
        thread2.start();
    }
    private void doWork() {
        lock.lock(); //захоплення блокування
        try {
            System.out.println("Critical section is executed by " + Thread.currentThread().getName());
        } finally {
            lock.unlock(); //обов'язкове відпускання блокування в блоці finally
        }
    }
//    Обидва підходи забезпечують взаємне виключення для критичного розділу коду. Вибір між ними
//    залежить від конкретних потреб вашого застосунку.

    private void doWorkSync() {
        synchronized (lockObj) {
            System.out.println("Critical section is executed by " + Thread.currentThread().getName());
        }
    }
}
