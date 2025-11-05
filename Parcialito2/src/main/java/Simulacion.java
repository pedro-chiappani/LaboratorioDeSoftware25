import java.util.ArrayList;
import java.util.List;

public class Simulacion {
    private List<Auto> autos;
    private int capacidadPista;
    private int vueltas;

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }


    public void setCapacidadPista(int capacidadPista) {
        this.capacidadPista = capacidadPista;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public int getVueltas() {
        return vueltas;
    }

    public int getCapacidadPista() {
        return capacidadPista;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public static Simulacion prepararSimulacion(Circuito unCircuito, int cantAutos, List<String>  pilotos) throws Exception{
        Simulacion s = new Simulacion();
        ProcesadorCarrera.setearCarrera(unCircuito, s);
        s.setAutos(unCircuito.iniciarCircuito(cantAutos, pilotos));
        return s;
    }


}
