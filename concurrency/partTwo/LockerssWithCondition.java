package concurrency.partTwo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockerssWithCondition {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean flag = false;

    public static void main(String[] args) {
        LockerssWithCondition example = new LockerssWithCondition();
        Thread waitingThread = new Thread(() -> {
            try {
                example.waitForFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread signalingThread = new Thread(example::setFlagTrue);
        waitingThread.start();
        signalingThread.start();
    }

    private void waitForFlag() throws InterruptedException {
        lock.lock();
        try {
            while (!flag) {
                condition.await(); //чекаємо поки flag не стане true
            };
            System.out.println("Flag is true!");
        } finally {
            lock.unlock();
        }
    }

    private void setFlagTrue() {
        lock.lock();
        try {
            flag = true;
            condition.signalAll(); //Повідомляємо всім очікуючим потокам, що flag змінився
        } finally {
            lock.unlock();
        }
    }
}
