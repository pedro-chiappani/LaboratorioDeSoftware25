# Practica 5

1. ## Analice qué ocurre con la siguiente clase cuando se compila:

    ```java
    public class TestSobreescritura {
        @Override
        public String tostring() {
            return super.toString() + " Testeando: 'Override'";
        }
    }
    ```

   \> *Indica que el metodo no lo encuentra para sobreescribir*

    ```java
    public class TestDeprecated {
        @Deprecated
        public void hacer() {
            System.out.println("Testeando: 'Deprecated'");
        }
    }
       
    public class TestAnotaciones {
        public static void main(String arg[]) throws Exception {
            new TestAnotaciones().testearYa();
        }
      
        @SuppressWarnings({"deprecation"})
         public void testearYa() {
            TestDeprecated t2 = new TestDeprecated();
            t2.hacer();
        }
    }
    ```

   - ### a) ¿Qué ocurre cuando se ejecuta TestAnotaciones?
        Imprime en consola "Testeando: 'Deprecated'"

   - ### b) ¿Qué ocurre si se elimina @SuppressWarnings({"deprecation"})? ¿el resultado de la ejecución es el mismo?

        Sigue funcionando de la misma forma solo que ahora en la compilacion te avisa que estas utilizando un metodo deprecated

   - ### c) ¿Cuál es la diferencia entre anotar el método testarYa() y anotar la clase TestAnotaciones?
        Cambia el alcance de la anotacion, entre solo el metodo y toda la clase.

2. ## Implementar una clase que mapee un objeto Bean a un archivo del filesystem y almacene en el archivo:
   1. ### El nombre de la clase
   2. ### Los nombres de los atributos 