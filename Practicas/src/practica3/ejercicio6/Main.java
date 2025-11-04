package practica3.ejercicio6;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Estudiante[] lista = {
                new Estudiante("Ganzero", "Luciano", 31, "20430/3", 34),
                new Estudiante("Chiappani", "Pedro", 25, "16195/2", 19),
                new Estudiante("Ilid", "Tomas", 24, "20322/0", 24)
        };

        // Por cantidad de materias aprobadas
        Arrays.sort(lista, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getMateriasAprobadas() - o2.getMateriasAprobadas();
            }
        });
        System.out.println("Por cantidad de materias aprobadas");
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }
        System.out.println();

        // Por edad de forma descendente
        Arrays.sort(lista, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o2.getEdad() - o1.getEdad();
            }
        });
        System.out.println("Por edades descendente");
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }
        System.out.println();

        // Por legajo
        Arrays.sort(lista, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getLegajo().compareTo(o2.getLegajo());
            }
        });
        System.out.println("Por legajo");
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }
        System.out.println();

        // Por nombre y apellido
        Arrays.sort(lista, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                int compApe = o2.getApellido().compareTo(o1.getApellido());
                System.out.println(compApe);
                if (compApe != 0) return compApe;
                return o2.getNombre().compareTo(o1.getNombre());
            }
        });
        System.out.println("Por nombre y apellido");
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }
    }
}
