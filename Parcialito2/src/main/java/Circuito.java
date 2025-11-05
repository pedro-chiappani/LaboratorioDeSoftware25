import java.util.ArrayList;
import java.util.List;

@ConfiguradorSimulacion(vueltas=1,longitud=100,capacidad=5)
public class Circuito{
    private int distancia;

    public Circuito(){
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public List<Auto> iniciarCircuito(int cantAutos, List<String> pilotos) throws Exception {
        if (cantAutos==0){
            throw new Exception("No hay autos asignados");
        }
        if (cantAutos != pilotos.size()){
            throw new Exception("La cantidad de autos y pilotos difiere");
        }
        List<Auto> autos = new ArrayList<Auto>();
        for (String p: pilotos){
            autos.add(new Auto(p, distancia));
        }
        return autos;
    }
}
