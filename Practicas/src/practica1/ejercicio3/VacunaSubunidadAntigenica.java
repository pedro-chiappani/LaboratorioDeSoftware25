package practica1.ejercicio3;
import practica1.ejercicio1.Vacuna;
public class VacunaSubunidadAntigenica extends Vacuna {
    private int cantAntogenos;
    private String proceso;

    public VacunaSubunidadAntigenica(int cantA, String process){
        super();
        this.cantAntogenos = cantA;
        this.proceso = process;
    }

    public int getCantAntogenos() {
        return cantAntogenos;
    }

    public void setCantAntogenos(int cantAntogenos) {
        this.cantAntogenos = cantAntogenos;
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
}
