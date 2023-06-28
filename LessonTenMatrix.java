import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonTenMatrix {
    /* 2. Створити клас для роботи с масивом чисел. Він повинен вміти:
//- створювати масив з випадковими числами с заданим розміром
//- сортувати масив у дві сторони
//- вивести на консоль масив
     */
    public static void main(String[] args) {
//        створювати масив з випадковими числами с заданим розміром
//        вивести на консоль масив
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Задайте розмір масиву (від 0 до 20): ");
        int z = scanner.nextInt();
        if (0 < z && z < 20) {
            int[] matrixZ = new int[z];
            for (int i = 0; i < z; i++) {
                matrixZ[i] = random.nextInt(10);
            }
            System.out.println("Створено масив з випадковими числами (від 0 до 10):\n" + Arrays.toString(matrixZ));

//        - сортувати масив у дві сторони
            int temp = 0;
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z - i - 1; j++) {
                    if (matrixZ[j] > matrixZ[j + 1]) {
                        temp = matrixZ[j];
                        matrixZ[j] = matrixZ[j + 1];
                        matrixZ[j + 1] = temp;
                    }
                }
            }
            System.out.println("Відсортований масив в одну сторону:\n" + Arrays.toString(matrixZ));

            for (int i = 0; i < z; i++) {
                for (int j = 0; j < z - i - 1; j++) {
                    if (matrixZ[j] < matrixZ[j + 1]) {
                        temp = matrixZ[j];
                        matrixZ[j] = matrixZ[j + 1];
                        matrixZ[j + 1] = temp;
                    }
                }
            }
            System.out.println("Відсортований масив в другу сторону:\n" + Arrays.toString(matrixZ));
        } else {
            System.out.println("Значення знаходиться за вказаними межами!");
        }
    }
}
