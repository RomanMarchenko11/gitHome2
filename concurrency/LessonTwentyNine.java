package concurrency;

public class LessonTwentyNine {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-------------- Home Work--------------");
//        Створити 2 потоки, які паралельно виводять на консоль числа від 1 до 10 та пишуть назву потоку
        Thread threadNumbers1 = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread ONE: " + i);
            }
        });
        Thread threadNumbers2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread TWO: " + i);
            }
        });
        threadNumbers1.start();
        threadNumbers2.start();

        System.out.println("--------------Class Work--------------");
        System.out.println("First way to create threads");
        MyThreadTest myThread1 = new MyThreadTest(1);
        MyThreadTest myThread2 = new MyThreadTest(2);
        MyThreadTest myThread3 = new MyThreadTest(3);
        MyThreadTest myThread4 = new MyThreadTest(4);
        MyThreadTest myThread5 = new MyThreadTest(5);
        MyThreadTest myThread6 = new MyThreadTest(6);
        MyThreadTest myThread7 = new MyThreadTest(7);
        MyThreadTest myThread8 = new MyThreadTest(8);
        MyThreadTest myThread9 = new MyThreadTest(9);
        MyThreadTest myThread10 = new MyThreadTest(10);

        runThreadTest(myThread1, myThread2, myThread3, myThread4, myThread5, myThread6, myThread7, myThread8, myThread9, myThread10);

        System.out.println("Second way to create threads");
//        Thread t = new Thread(new  Runnable(1));

        Thread thread = new Thread(() -> {
            System.out.println("runs");
        }
        );
        thread.start();

//        Thread t = new Thread(new MyRunnable(1));

        System.out.println("Third way to create threads");
        Runnable task = () -> {
            System.out.println("it running");
        };
        new Thread(task).start();

        System.out.println("Counter Synchronization");
        Counter counter = new Counter();
        Thread threadSynch1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread threadSynch2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        threadSynch1.start();
        threadSynch2.start();

        threadSynch1.join();
        threadSynch2.join();
        System.out.println("Final Counter: " + counter.getCount());

        System.out.println("Bank Account: withdraw");
        BankAccount bankAccount = new BankAccount();
        Thread threadWithdraw1 = new Thread(() -> {
            bankAccount.withdraw(60);
        });
        Thread threadWithdraw2 = new Thread(() -> {
            bankAccount.withdraw(70);
        });
        threadWithdraw1.start();
        threadWithdraw2.start();
    }

    private static void runThreadTest(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

}
