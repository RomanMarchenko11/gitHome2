package concurrency;

public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        new Thread(() -> {
//            цей потік чекає поки флаг не зміниться
            while (!flag) {
//                якийсь код
            }
            System.out.println("Flag has been changed to true!");
        }).start();
        new Thread(() -> {
//            цей потік змінює флаг після короткої затримки
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true;
            System.out.println("Flag changed to true");
        }).start();
    }
}
