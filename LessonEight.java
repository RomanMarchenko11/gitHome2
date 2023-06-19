import java.util.Arrays;
import java.util.Random;

public class LessonEight {
    public static void main(String[] args) {
        int [] intArray = new int[5]; //5 елементів одномірного масиву
        int [] intArray2 = {1,3,5}; //3 елементу одномірного масиву
        Random random = new Random();

        String [] [] firstSecond = new String[3][3];

        for (int i=0; i < 5; i++){
            intArray[i] = random.nextInt(100);
            System.out.print(intArray[i] + " ");
        }
        System.out.println("-------------------------------");

        for (int i=0; i<firstSecond.length; i++) {
            for (int j=0; j<firstSecond[i].length; j++) {
                firstSecond[i][j] = String.valueOf(random.nextInt(100));
                System.out.print(firstSecond[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------");

//        Створіть масив цілих чисел та обчисліть суму всіх чисел в масиві.
        int [] numers = new int[5];
        int sum = 0;
        for (int i=0; i<5; i++) {
            numers [i] = random.nextInt(10);
            System.out.print(numers[i] + " ");
            sum += numers[i];
        }
        System.out.println("Cума чисел в масиві: " + sum);
    }
}
