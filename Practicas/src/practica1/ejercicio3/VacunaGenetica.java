package practica1.ejercicio3;
import practica1.ejercicio1.Vacuna;
public class VacunaGenetica extends Vacuna{
    private double minTemp;
    private double maxTemp;

    public VacunaGenetica(double minTemp, double maxTemp){
        super();
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(double minTemp) {
        this.minTemp = minTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }
}
