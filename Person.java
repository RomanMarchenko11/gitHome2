import java.util.Objects;

public class Person {
                /*
        Створіть клас Person з наступними полями:

        firstName (ім'я)
        lastName (прізвище)
        age (вік)
        Перевизначте метод equals(), таким чином, що дві особи будуть вважатися рівними,
         якщо їх імена, прізвища і вік співпадають.

        Перевизначте метод hashCode() відповідно до вашого методу equals().
     */

    String firstName;
    String lastName;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
