package practica3.ejercicio8;

public enum FrecuenciasDeLa {
    FREQ440("440Hz","Organización Internacional de Estandarización ISO 16"),
    FREQ444("444Hz","Afinación de cámara"),
    FREQ446("446Hz","Renacimiento"),
    FREQ480("480Hz","Órganos alemanes que tocaba Bach");
    private final String frec;
    private final String desc;
     FrecuenciasDeLa(String frec, String desc){
         this.frec = frec;
         this.desc=desc;
     }
     public String getFrec(){
         return this.frec;
     }
     public String getDesc(){
         return this.desc;
     }
}
