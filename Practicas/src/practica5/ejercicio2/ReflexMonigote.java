package practica5.ejercicio2;

import java.lang.classfile.Annotation;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;

public class ReflexMonigote {

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }


    public static String makeLine(String tipo, String nom){
        return "<nombre"+tipo+">"+nom+"</nombre"+tipo+">";
    }

    public static void createFile(String nombre){
        try{
            File file = new File(nombre);
            if (file.createNewFile()){
                System.out.println("Archivo guardado");
            }
            else{
                System.out.println("Nombre ya existente");
            }
        } catch (IOException e){
            System.out.println("Error al crear el archivo");
            e.printStackTrace();
        }
    }

    public static void writeFile(String nombre, List<String> lineas){
        try(FileWriter fw = new FileWriter(nombre)){
            for(String linea : lineas){
                fw.write(linea+"\r\n");
            }
        } catch (IOException e){
            System.out.println("Error al escribir el archivo");
            e.printStackTrace();
        }
    }


    public static void procesar(Object object){
        String nomArchivo = "";
        Class<?> clase = object.getClass();
        List<String> lines = new ArrayList<>();
        if (clase.isAnnotationPresent(Archivo.class))
            if (!Objects.equals(clase.getAnnotation(Archivo.class).nombre(), ""))
                nomArchivo = clase.getAnnotation(Archivo.class).nombre();
            else
                nomArchivo = clase.getSimpleName() + ".txt";
        lines.add(makeLine("Clase", nomArchivo));

        Field[] fields = clase.getDeclaredFields();
        for (Field f : fields){
            if (f.isAnnotationPresent(AlmacenarAtributo.class)){
                String nomAtributo = f.getName();
                lines.add(makeLine("Atributo", nomAtributo));

                        try{
                            Object valor = clase.getMethod("get"+toTitleCase(nomAtributo)).invoke(object);
                            lines.add(makeLine("Valor", String.valueOf(valor)));
                        } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException e) {
                            throw new RuntimeException(e);
                        }

            }
        }
        createFile(nomArchivo);
        writeFile(nomArchivo, lines);

    }

    public static void main(String[] args)
    {
        procesar(new Monigote());
    }
}
