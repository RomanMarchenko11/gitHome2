package concurrency.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/*
1 ExecutorService / Semaphore
Припустимо, у нас є басейн із обмеженою кількістю ліжок (наприклад, 3), і клієнти приходять, щоб взяти ліжка для відпочинку.
Ми хочемо забезпечити, щоб одночасно було доступно обмежене число ліжок, а інші клієнти повинні чекати, поки ліжка звільняться.
*/
public class FirstPoolTask {
    private static final int BEDS_COUNT = 3;
    private static final int CLIENTS_COUNT = 6;
    private static final Semaphore semaphore = new Semaphore(BEDS_COUNT);
    private static final ExecutorService executorService = Executors.newFixedThreadPool(CLIENTS_COUNT);

    public static void main(String[] args) {
        for (int i = 1; i <= CLIENTS_COUNT; i++) {
            executorService.execute(new Client(i));
        }
        executorService.shutdown();
    }

    static class Client implements Runnable {
        private final int id;
        public Client(int id) {
            this.id = id;
        }
        @Override
        public void run(){
            System.out.println("Client " + id + " is waiting for bed.");
            try {
                semaphore.acquire(); //клієнт чекає вільне ліжко
                Thread.sleep(5000);
                System.out.println("Client " + id + " has left the bed.");

                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}