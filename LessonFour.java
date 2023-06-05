import java.util.Locale;

/*
Створити програму для обробки символьних рядків:
    - Створити зміну типу String
    - Показати цю зміну у верхньому та нижньому регістрах
    - Показати першу та останню літери
 */
public class LessonFour {
    public static void main(String[] args) {
        String name = "Roman";
        String surname = "Marchenko";
        System.out.println("Користувач: " + name + " " + surname);
        System.out.println("Моє ім'я можемо написати так: " + name.toUpperCase() + ", або так: " + name.toLowerCase());

        System.out.println("Вгадай моє ім'я, яке починається та закінчується на: " + name.charAt(0) + "..." + (name.charAt(name.length()-1)));
    }
}
