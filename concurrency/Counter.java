package concurrency;

public class Counter {
    private int count = 0;

//method 1
//    public void increment() {
//        count++;
//    }
//method 2
    public synchronized void increment() {
        count++;
    }
//    method 3
//    public void increment() {
//        synchronized (this) {
//            count++;
//        }
//    }
// method 2 the same method 3
    public int getCount() {
        return count;
    }
}
