# Temas
- #### Conceptos y uso de excepciones
- #### Try/catch/finally
- #### Definición de Excepciones

1. ### Determine si el siguiente código es correcto. Si produce un error, observe de qué tipo es y soluciónelo
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
    