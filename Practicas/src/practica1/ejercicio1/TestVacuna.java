package practica1.ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestVacuna {
    public static void main(String[] args) {
        Vacuna vacunas[] = new Vacuna[5];
        Vacuna vacu = new Vacuna();
        vacu.setMarca("Marca0");
        vacu.setPais("Pais0");
        vacu.setEnfermedad("Enfermedad0");
        vacu.setDosis(0);

        for  (int i = 0; i < vacunas.length; i++) {
            vacunas[i] = new Vacuna();
            vacunas[i].setMarca("Marca" + i+1);
            vacunas[i].setPais("Pais" + i+1);
            vacunas[i].setEnfermedad("Enfermedad" + i+1);
            vacunas[i].setDosis(i+1);
        }

        for (Vacuna vacuna : vacunas) {
            System.out.println(vacuna.toString());
        }

        System.out.println(vacu.getClass());
        System.out.println(vacunas.getClass());
        System.out.println(vacu.equals(vacunas));

    }
}