package EnumRecord;

import java.util.Arrays;

/*
   Задача: Система обліку студентів

   Уявіть, що ви розробляєте систему обліку студентів для університету.
   Ваша мета - створити модель даних, яка дозволить зберігати інформацію про студентів,
   таку як їхнє ім'я, прізвище, курс та середній бал.

   Використовуючи рекорди (Records) в Java, створіть клас,
   який представлятиме студента і міститиме поля для
   імені (name), прізвища (surname), курсу (course) та середнього балу (averageGrade).
   Напишіть метод, який приймає масив студентів і виводить інформацію про кожного студента на консоль.
   Напишіть ще один метод, який приймає масив студентів та повертає середній бал всіх студентів.
    */
public record StudentCard(String name, String surname, int course, double averageGrade) {
    public StudentCard() {
        this("Ivan", "Ivanov", 1, 0);
    }
    public void printAll (StudentCard[] studentCard){
//        for (int i = 0; i < studentCard.length; i++){
//            System.out.println(Arrays.toString(studentCard));
//        }
        System.out.println(Arrays.toString(studentCard));
    }

}
