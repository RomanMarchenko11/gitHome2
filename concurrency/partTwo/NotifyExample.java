package concurrency.partTwo;

public class NotifyExample {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waitingThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting ...");
                    lock.wait();
                    System.out.println("Resumed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread notifyThread = new Thread(() -> {
            synchronized (lock) {
                lock.notify(); //пробуджує waitingThread
                System.out.println("Notified");
            }
        });
        waitingThread.start();
        notifyThread.start();
    }
}
