# Temas
- #### Conceptos y uso de excepciones
- #### Try/catch/finally
- #### Definición de Excepciones

1. ## Determine si el siguiente código es correcto. Si produce un error, observe de qué tipo es y soluciónelo
    ``` java
   class Excepcion1 extends Exception{}
   class Excepcion2 extends Exception1{}
   public class Test1 {
       public static void main(String[] args) {
           try {
               throw new Exception2();
           } catch(Excepcion1 e1) {
               System.out.println(“Se capturó la Excepción1”);
           } catch( Excepcion2 e2) {
               System.out.println(“Se capturó la Excepción2”);
           }
       }
   } 
   ```
    Tira error en la linea de definicion de la clase `Excepcion2` ya que intenta extender de una clase que no existe `Exception1`
    Pero se soluciona cambiando a `Excepcion1`.
    Tambien en el throw lanza `Exception2` que no existe, se reemplaza por `Excepcion2`.
    Tira error en el `catch Excepcion2` ya que al ser subclase de `Excepcion1` y estar definido el `catch Excepcion1` antes, ya esta cubierta.
    Se soluciona cambiando el orden de los `catch`

2. ## Ejecute el siguiente código. ¿Cuál es el resultado?. Elimine los comentarios y vuelva a ejecutarlo. ¿Cuál es el resultado?.
    ```java
    public class Test2 {
        public int unMetodo(){
        // try {
            System.out.println("Va a retornar 1");
            return 1;
        // } finally {
            System.out.println("Va a retornar 2");
            return 2;
        // }
    }
    public static void main(String[] args) {
        Test2 res = new Test2();
        System.out.println(res.unMetodo());
        }
    }
    ```
    Marca un error en la sentencia `System.out.println("Va a retornar 2")` ya 
   que el nunca se va a llegar a esa linea por el return que está antes.  
    Descomentando esas lineas imprime tanto `System.out.println("Va a retornar 1");` 
   como `System.out.println("Va a retornar 2");` y retorna el valor 2 ya que se 
   ejecuta el codigo del bloque ***try*** y el codigo del bloque ***finally***.

3. ## Ejecute el siguiente código. ¿Cuál es la salida del programa?

    ```java
    public class Test3 {
        public static void main(String[] args) {
            System.out.println("Test3");
            try {
                System.out.println("Primer try");
                try {
                    throw new Exception();
                } finally {
                    System.out.println("Finally del 2º try");
                }
            } catch (Exception e) {
                System.out.println("Se capturó la Excepción ex del 1º Primer try");
            } finally {
                System.out.println("Finally del 1º try");
            }
        }
    }
    ```
    Imprime todas las sentencias declaradas en el orden que está.
4. ## Analice el siguiente código y determine si es correcto. Si hay errores, escriba el motivo de cada uno y proponga una solución.

    ```java
    class FutbolException extends Exception{}
    class Falta extends FutbolException{}
    class EquipoIncompleto extends FutbolException{}
    class ClimaException extends Exception{}
    class Lluvia extends ClimaException{}
    class Mano extends Falta{}
    class Partido {
        Partido() throws FutbolException{}
        void evento() throws FutbolException{}
        void jugada() throws EquipoIncompleto,Falta{}
        void penal(){}
    }
   
    interface Tormenta{
        void evento() throws Lluvia;
        void diluvio() throws Lluvia;
   }
    ```
   ```java
   public class Encuentro extends Partido implements Tormenta {
        Encuentro() throws Lluvia, FutbolException{}
        Encuentro (String fecha) throws Falta, FutbolException{}
        void penal() throws Mano{}
        public void evento() throws Lluvia{}
        public void diluvio() throws Lluvia{}
        public void evento(){}
        void jugada() throws Mano{}
        public static void main (String[] args) {
            try {
                Encuentro enc = new Encuentro();
                enc.jugada();
            } catch(Mano e) {
            } catch(Lluvia e) {
            } catch(FutbolException e) {
                try {
                    Partido par = new Encuentro();
                    par.jugada();
                } catch(EquipoIncompleto e) {
                } catch(Falta e) {
                } catch(Lluvia e) {
                } catch(FutbolException e) {}
            }
        }
   }
   ```