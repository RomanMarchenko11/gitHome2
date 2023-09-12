package concurrency.partTwo;

import concurrency.VolatileExample;

public class LockerssVolatile {
    private volatile boolean flag = false;

    public static void main(String[] args) {
        LockerssVolatile example = new LockerssVolatile();
        Thread waitingThread = new Thread(() -> {
            try {
                example.waitForFlag();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread signaling = new Thread(example::setFlagTrue);
    }

    public void waitForFlag() throws InterruptedException {
        while (!flag) {
            Thread.sleep(10); //це не найкращий спосіб чекати
        }
        System.out.println("Flag is true!");
    }

    public void setFlagTrue() {
        flag = true;
    }
}
