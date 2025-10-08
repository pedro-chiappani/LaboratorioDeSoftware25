package practica5.ejercicio2;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Archivo {
    String nombre() default "";
}
