package practica1;
//Punto 1a

public class Vacuna {
    private String marca;
    private String pais;
    private String enfermedad;
    private int dosis;

    public Vacuna(){
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }
// Punto 1a y 1b
//    public String toString(){
//        StringBuffer s = new StringBuffer();
//        s.append("Marca: " + this.marca + "\n");
//        s.append("Pais: " + this.pais + "\n");
//        s.append("Enfermedad: " + this.enfermedad + "\n");
//        s.append("Dosis: " + this.dosis + "\n");
//
//        String str = s.toString();
//
//        return str;
//    }
}
