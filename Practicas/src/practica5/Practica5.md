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
3. ## Implementar el siguiente ejercicio:
   - ### a. Definir la anotación RUNTIME llamada @Servidor que se utiliza para anotar una clase que funcionará como un servidor HTTP. Esta anotación debe poseer los siguientes atributos:
     - dirección – indica la dirección IP a la cual se conectarán los clientes.
     - puerto – indica el puerto donde espera las conexiones de los clientes.
     - archivo – indica el archivo en el que se guardará la información de login.
   - ### b. Definir la anotación RUNTIME llamada @Invocar que se utiliza para marcar el o los métodos de clase que deben ser invocados cuando un cliente se conecta al servidor.
   - ### c. Utilice las anotaciones previamente definidas para anotar una clase cualquiera.
   - ### d. Implementar una clase llamada Contenedor que procese la clase anotada para escuchar peticiones de red en la IP y puerto especificados y luego delegar la atención de las mismas en los métodos de la clase anotada. La clase Contenedor al recibir una petición deberá realizar dos tareas:
     - Loguear Fecha, Hora e IP del cliente en un archivo de texto cuyo nombre se indicó en la anotación @Servidor
     - Invocar a todos los métodos que fueron anotados con la anotación @Invocar
   - ### e. Pruebe el servidor HTTP creado en los incisos anteriores con un navegador de Internet.