package practica5.ejercicio2;

@Archivo()
public class Monigote {

    @AlmacenarAtributo
    private String valore = "Algo";


    private Integer valore2 = 20;
    @AlmacenarAtributo
    private Float valore3 = 0.5f;

    public String getValore() {
        return valore;
    }

    public void setValore(String valore) {
        this.valore = valore;
    }

    public Integer getValore2() {
        return valore2;
    }

    public void setValore2(Integer valore2) {
        this.valore2 = valore2;
    }

    public Float getValore3() {
        return valore3;
    }

    public void setValore3(Float valore3) {
        this.valore3 = valore3;
    }
}
