import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LessonNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привіт. Практичні завдання:");
        System.out.println("1-додавання одного масиву до іншого");
        System.out.println("2-визначення типу матриці");
        System.out.println("3-бульбашкове сортування");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> matrixAdd();
            case 2 -> matrix(scanner);
            case 3 -> bubbleSort(scanner);
            default -> System.out.println("?!");
        }
    }
    public static void matrixAdd() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] matrix3 = new int[3][3];
        System.out.println("Задані матриці:");
        System.out.println(Arrays.deepToString((matrix1)));
        System.out.println(Arrays.deepToString((matrix2)));
        System.out.println("Сума заданих матриць:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                    matrix3 [i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString((matrix3)));
    }

    private static void matrix(Scanner scanner) {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rectangularMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] singleElementMatrix = {{10}};

        System.out.println("Визначимо тип матриці. Вибери матрицю:");
        System.out.println("1-матриця:");
        for (int i = 0; i < squareMatrix.length; i++ ) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("2-матриця:");
        for (int i = 0; i < rectangularMatrix.length; i++ ) {
            for (int j = 0; j < rectangularMatrix[i].length; j++) {
                System.out.print(rectangularMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("3-матриця:");
        for (int i = 0; i < singleElementMatrix.length; i++ ) {
            for (int j = 0; j < singleElementMatrix[i].length; j++) {
                System.out.print(singleElementMatrix[i][j] + " ");
            }
            System.out.println("");
        }
        int chooseMatrix = scanner.nextInt();
        int [][] newMatrix = new int [0][0];

        switch (chooseMatrix) {
            case 1 -> newMatrix = squareMatrix;
            case 2 -> newMatrix = rectangularMatrix;
            case 3 -> newMatrix = singleElementMatrix;
            default -> System.out.println("Це не з нашої пісочниці");
        }
       if ( chooseMatrix >= 1 && chooseMatrix <= 3) {
            if (newMatrix.length == 1 && newMatrix[0].length == 1) {
                System.out.println("Тип матриці: singleMatrix");
            } else if (newMatrix.length == newMatrix[0].length) {
                System.out.println("Тип матриці: squareMatrix");
            } else {
                System.out.println("Тип матриці: rectangularMatrix");
            }
        }
    }
    public static void bubbleSort(Scanner scanner) {
        System.out.println("Задайте кількість елементів в масиві:");
        int n = scanner.nextInt();
        int [] matrix = new int[n];
        int temp;
//        надаємо значень масиву
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(10);
            System.out.print(matrix[i] + " ");
        }
//        сортуємо матрицю від більшого значення до меншого

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length-i-1; j++) {
                if (matrix[j] > matrix[j + 1] ) {
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
//        перевіряємо масив
        System.out.println("\n-----------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i] + " ");
        }
    }

}
