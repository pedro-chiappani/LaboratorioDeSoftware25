package practica5.ejercicio1;

public class TestAnotaciones {
    public static void main(String arg[]) throws Exception {
        new TestAnotaciones().testearYa();
    }
    @SuppressWarnings({"deprecation"})
    public void testearYa() {
        TestDeprecated t = new TestDeprecated();
        t.hacer();
    }
}
