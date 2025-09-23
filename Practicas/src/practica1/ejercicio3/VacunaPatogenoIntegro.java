package practica1.ejercicio3;
import practica1.ejercicio1.Vacuna;
public class VacunaPatogenoIntegro extends Vacuna {

    private String patogeno;

    public VacunaPatogenoIntegro(String pathogen) {
        super();
        this.patogeno = pathogen;
    }

    public void setPatogeno(String pathogen) {
        this.patogeno = pathogen;
    }

    public String getPatogeno() {
        return this.patogeno;
    }
}
