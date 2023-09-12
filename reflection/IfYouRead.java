package reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.FIELD;

@Retention(RUNTIME)
@Target(FIELD)
public @interface IfYouRead {
    boolean validate() default true;
}

