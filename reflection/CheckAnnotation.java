package reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class CheckAnnotation {

    public void checkReadValidation(Object object) {
        checkIfSerializable(object);
        checkReadValidate(object);
    }
    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            throw new RuntimeException();
        }

        Class<?> clas = object.getClass();
        if (!clas.isAnnotationPresent(AnnotateValidate.class)) {
            throw new RuntimeException("The class " + clas.getSimpleName() + " " +
                    "is not annotation with AnnotateValidate");
        }
    }

    private void checkReadValidate(Object object) {
        Class<?> clas = object.getClass();
        Arrays.stream(clas.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(IfYouRead.class) && field.getAnnotation(IfYouRead.class).validate()) {
                        try {
                            boolean readBooks = (boolean) field.get(object);
                            validateClientReadBooks(readBooks,field);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }

    /*
        private void validateAge(Object object) {
            Class<?> clazz = object.getClass();
            Arrays.stream(clazz.getDeclaredFields()).forEach(
                    field -> {
                        field.setAccessible(true);
                        if (field.isAnnotationPresent(CheckForAge.class) && field.getAnnotation(CheckForAge.class).validate()) {
                            try {
                                int age = (Integer) field.get(object);
                                validateHumanAge(age, field);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
            );
        }
     */
    private void validateClientReadBooks(boolean readBooks, Field field) {
        if (!readBooks) {
            throw new CheckReadException("Client has not yet read book!" + field.getDeclaringClass().getTypeName());
        }
    }
}
