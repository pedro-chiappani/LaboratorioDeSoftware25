package practica5.ejercicio2;

import java.lang.classfile.Annotation;
import java.lang.reflect.*;
import java.util.*;

public class ReflexMonigote {

    public static void procesar(Object object){
        Class<?> clase = object.getClass();
        if (clase.isAnnotationPresent(Archivo.class))
            if (!Objects.equals(clase.getAnnotation(Archivo.class).nombre(), ""))
                System.out.println(clase.getAnnotation(Archivo.class).nombre());
            else
                System.out.println(clase.getSimpleName());
    }

    public static void main(String[] args)
    {
        procesar(new Monigote());
    }
}
