public enum RazaCaballo {
    PALOMINO("Palomino","Pelaje dorado con crin y cola blancas."),
    ARABE("Arabian","cabeza en forma de cuña, frente amplia, ojos grandes, fosas nasales grandes y hocicos pequeños."),
    GRULLO("Grullo","Tambien denomidano Pardo Azul. Pelaje con un tono azulado, con las crines y patas mas oscuras."),
    AMERICAN_PAINT("American Paint","Tambien denominado Paint Horse. Pelaje manchado de blanco y otro color, ademas de su conformacion musculosa y altetica.");

    private String name;
    private String descripcion;

    private RazaCaballo(String name, String descripcion) {
        this.name = name;
        this.descripcion = descripcion;
    }
    public String getName() {
        return name;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
