package day6.reflections;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//przedłużanie żywotności adnotacji przes cały czas działania programu
@Target(ElementType.METHOD)   //oznaczenie , że dopisywana będzie do metody (tylko) takie ogranicznie
public @interface RunIt {
    String name() default "default strng";
}
