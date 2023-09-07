package concurrency.partTwo;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

public class LessonThirty {
    public static void main(String[] args) {
        homeWork1();
        homeWork2();
    }

    public static void homeWork1() {
//        1.  Створити поток який генерує числа від 1 до 10 і нескінченно їх виводить на консоль.
//        Якщо згенероване число == 5 - то перервати роботу потоку
        Random random = new Random();
        Thread threadGenerateNumbers = new Thread(() -> {
            System.out.println(" - - - - - - Home Work 1 - - - - - - ");
            int numberToStop = 0;
            while (numberToStop != 5) {
                numberToStop = random.nextInt(1,10);
                System.out.print(" " + numberToStop);
            }
        });
        threadGenerateNumbers.start();
    }

    public static void homeWork2() {
//        2.  Створити callable потік, який повертає випадково згенероване число від 1 до 50.
//        Зробити пул з 10 потоків для виклику цього методу
        ExecutorService executorServiceTen = Executors.newFixedThreadPool(10);
        Random random = new Random();

        Callable<Integer> number = () -> {
            Thread.sleep(500);
            return random.nextInt(1,50);
        };

        System.out.println(" - - - - - - Home Work 2 - - - - - - ");
        try {
            for (int i = 0; i < 10; i++){
            Future<Integer> randomNumber = executorServiceTen.submit(number);
            System.out.println((i+1) + "-" + randomNumber.get() + " ");}
        } catch (InterruptedException |ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorServiceTen.shutdown();
        }
    }
    private static void sleep() {
        System.out.println("Start");
        try {
            Thread.sleep(2000); //призупиняє потік в мсек (2 сек)
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("End");
    }

    private static void yield(){
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <5; i++) {
                System.out.println("Thread 1");
                Thread.yield(); //дає можливість виконуватись іншим потокам
            }
        });
        Thread t2 = new Thread(() -> {
            for (int u = 1; u < 5; u++) {
                System.out.println("Thread 2");
                Thread.yield();
            }
        });
        t1.start();
        t2.start();
    }

    public static void setPriority() {
        Thread t1 = new Thread(() -> {
            System.out.println("Low Priority Thread");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("High Priority Thread");
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
    }

    public static void daemon() {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(2000);
                    System.out.println("Daemon Thread is working ... ");
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        daemonThread.setDaemon(true); //встановлюємо потік як daemon
        daemonThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread is ending ... ");
    }

    public static void threadGroup() {
        ThreadGroup group = new ThreadGroup("Group 1");
        Thread thread1 = new Thread(group, () -> {
            System.out.println("Thread 1");
        });
        Thread thread2 = new Thread(group, () -> {
            System.out.println("Thread 2");
        });
        thread1.start();
        thread2.start();
    }

    public static void threadJoin() {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is started ...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 is ended ... ");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is started ...");
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 is ended ...");
        });

        thread1.start();
        thread2.start();
    }
}
