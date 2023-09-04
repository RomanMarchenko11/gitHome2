package reflection;

import javax.imageio.IIOException;
import java.lang.reflect.*;
import java.util.Arrays;

public class LessonTwentyEight {

    public static void main(String[] args) {
        System.out.println("------------Home Work------------");

        Library libraryClient1 = new Library("Mark", false);
        Library libraryClient2 = new Library("Tom", true);
        CheckAnnotation checkAnnotation = new CheckAnnotation();
        checkAnnotation.checkReadValidation(libraryClient1);
        checkAnnotation.checkReadValidation(libraryClient2);


        System.out.println("-----------Class Work------------");

        Persona persona = new Persona();

        Class<Persona> personaClass = Persona.class;
//  Дізнаємось ім'я класу
        System.out.println(personaClass.getName());
//  Дізнаємось модифікатори класу (що біля імені класу)
        System.out.println(personaClass.getModifiers());
        System.out.println(Modifier.toString(personaClass.getModifiers()));
//  Дізнаємось супер клас класу
        System.out.println(personaClass.getSuperclass());
//  Дізнаємось інтерфейси класу
        System.out.println(Arrays.toString(personaClass.getInterfaces()));

//  Дізнаємось поля класу
        Field[] fields = personaClass.getDeclaredFields();
//        Arrays.stream(fields).forEach(System.out::println);
        Arrays.stream(fields).forEach(
                field -> {
                    System.out.println(field.getName());
                    System.out.println(field.getType());
                    System.out.println(Modifier.toString(field.getModifiers()));
                });
//  Дізнаємося методи класу
        System.out.println("\nMethods");
        Method[] methods = personaClass.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
//  як викликати метод
        try {
            Method setMethodName = persona.getClass().getMethod("setName", String.class);
            setMethodName.invoke(persona, "Yuriy");
            System.out.println(persona.getName());

            Method setMethodSurname = persona.getClass().getMethod("setSurName", String.class);
            setMethodSurname.invoke(persona, "Vasilchenko");
            System.out.println(persona.getSurName());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException();
        }
        System.out.println("\nConstructors");
//  як дістати наявні конструктори
        Constructor[] constructors = personaClass.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
//  як запустити конструктор
        try {
            Constructor<Persona> constructor = personaClass.getConstructor(String.class);
            persona = constructor.newInstance("Arnold");
            System.out.println(persona.getName());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException();
        }
    }
}
