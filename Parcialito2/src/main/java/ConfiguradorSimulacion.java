import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfiguradorSimulacion {
    int vueltas();
    int longitud();
    int capacidad();
}
