package concurrency;

public class MyThreadTest extends Thread {
    private final int countMyThread;
public MyThreadTest(int countMyThread) {
    this.countMyThread = countMyThread;
}
    @Override
    public void run() {
        System.out.println("My thread starts " + countMyThread);
    }
}
