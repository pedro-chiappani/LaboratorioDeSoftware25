import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.*;

public class ProcesadorCarrera {

    public static void setearCarrera(Object circuito, Object simu) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> clase = circuito.getClass();
        if (clase.isAnnotationPresent(ConfiguradorSimulacion.class)){
            int v = clase.getAnnotation(ConfiguradorSimulacion.class).vueltas();
            int c = clase.getAnnotation(ConfiguradorSimulacion.class).capacidad();
            int l = clase.getAnnotation(ConfiguradorSimulacion.class).longitud();
            Method setter = clase.getDeclaredMethod("setDistancia", int.class);
            setter.setAccessible(true);
            setter.invoke(circuito, l);
            simu.getClass().getDeclaredMethod("setVueltas", int.class).invoke(simu, v);
            simu.getClass().getDeclaredMethod("setCapacidadPista", int.class).invoke(simu, c);
        }

    }
}
