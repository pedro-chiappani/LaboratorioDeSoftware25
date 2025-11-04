package practica3.ejercicio6;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String legajo;
    private int materiasAprobadas;

    public Estudiante(String nombre, String apellido, int edad, String legajo, int materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(int materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public String toString() {
        return apellido + ", " + nombre + " | Edad: " + edad + " | Legajo: " + legajo + " | Materias: " + materiasAprobadas;
    }
}
