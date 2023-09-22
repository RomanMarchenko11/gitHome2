package concurrency.practice;
/*
2 Lock / Condition
Припустимо, у нас є банкомат, який може обслуговувати лише одного клієнта одночасно.
Клієнти приходять, щоб взяти гроші з банкомату. Ми хочемо забезпечити,
щоб банкомат обслуговував тільки одного клієнта, поки він не закінчить операцію.
*/

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SecondBankomat {
    private static final Lock lock = new ReentrantLock();
    private static final Condition atmAvailable = lock.newCondition();
    private static boolean isAvailable = true;

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            new Thread(new Client(i)).start();
            System.out.println("Client " + i + " start");
        }
    }

    static class Client implements Runnable {
        private static int id;

        public Client(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                while (isAvailable) {
                    try {
                        atmAvailable.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException();
                    }
                }
                System.out.println("Client " + id + " is using ATM");
                Thread.sleep(2000);
                isAvailable = true;
                atmAvailable.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException();
            } finally {
                lock.unlock();
            }
        }
    }
}
