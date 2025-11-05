# Temas
- #### Clases anidadas y clases internas.
- #### Clases anónimas
- #### Módulos
- #### Tipos enumerativos
1. ## Complete el código de la clase Stack en el paquete practica3, de manera que implemente una pila de String:
    ```java
    public class Stack(){
        private java.util.ArrayList items;
        public Stack(){}
        public void push(Object item){}
        public Object pop(){}
        public boolean isEmpty(){}
   }
   ```
   - ### a) Implemente un método main() para probar la pila. Agregue Strings a la pila y recórrala para imprimir sus valores. ¿Cuántas veces puede recorrerla?
   - ### b) Agregue una clase anidada llamada StackIterator que provea un objeto de tipo Iterator para recorrer la pila.
   - ### c) Agregue en la clase Stack un método para que retorne una instancia de StackIterator. ¿Cuántas veces puede recorrer la pila ahora?
   - ### d) ¿Es posible crear objetos StackIterator desde una clase diferente a la clase Stack con el operador new?, ¿cómo lo hace?
   - ### e) ¿Cómo haría para evitar crear instancias de una clase anidada desde una clase que no sea la que la definió?
   ## Solucion -> [Main](ejercicio1/Main.java) [Stack](ejercicio1/Stack.java)
2. ## Analice el código que figura debajo.
    ```java
    class InnerStatic {
        static double PI = 3.1416;
        static class Circulo {
            static double radio = 2;
            static double getArea() {
                double a = PI * Math.pow(radio, 2);
                System.out.println("El area es: " + a);
                return a;
            }
            static double getLongitudCircunsferencia() {
                double l = 2 * PI * radio;
                System.out.println("La longitud es: " + l);
                return l;
            }
        }
    }
    ```
   - ### a) Modifique el código de la clase interna estática para que el valor inicial del radio sea ingresado por el usuario en el momento de la ejecución.
   - ### b) Defina una clase llamada InnerTest en el paquete practica3 con un método main() que imprime en la pantalla el área y la longitud de la circunferencia. Ejecútela varias veces ingresando distintos radios.
   - ### c) Remplazar PI* Math.pow(radio,2) por PI* pow(radio,2), siendo pow() el método de la clase java.lang.Math.
   ## Solucion -> [InnerStatic](ejercicio2/InnerStatic.java) [InnerTest](ejercicio2/InnerTest.java)
3. ## Implemente una clase llamada StringConverterSet como subclase de AbstractSet, la cual permita realizar todas las operaciones contempladas para los Set, con la salvedad que el método iterator() retorne un Iterator que al recorrelo devuelva cada uno de los elementos como Strings.Para su solución, defina un Adapter llamado IteratorStringAdapter como una clase anidada de StringConverterSet para cumplir lo solicitado.
    ## Solucion [StringConverterSet](ejercicio3/StringConverterSet.java)
4. ## Indicar si son verdaderas o falsas las siguientes afirmaciones sobre las clases anónimas y en cada caso justifique su respuesta:
   - ### Se pueden instanciar más allá del punto en donde fueron declaradas.
       **FALSO** - No se pueden instanciar mas alla del punto donde fueron declaradas ya que no tienen un nombre por el cual poder llamarlas. No hay manera de hacer `new <nombreDeClase>()`.
   - ### Unos de los usos más comunes de este tipo de clases es la creación de objetos función y procesos on the fly.
        **VERDADERO** - Si se suelen usar para este tipo de procesos, los *Callbacks*, *Listeners*, *Runnables*, etc. Objetos con un comportamiento localizado.
   - ### Se puede utilizar el instanceof siempre y cuando la interfaz de la que deriva la clase anónima sea de tipo marker.
       **FALSO** - Se puede hacer un `instanceof` con cualquier tipo de interfaz, no tiene que si o si ser *Marker*
   - ### No se puede implementar múltiples interfaces o extender clases e implementar interfaces al mismo tiempo.
       **VERDADERO** - Las clases anonimas estan limitadas a extender solo una clase o implementar una interface, no pueden hacer ambas cosas ni implementar mas de una interface.
5. ## Modifique el código de la clase Stack, para que ahora la clase anidada StackIterator, se convierta en una clase anónima.
    ## Implementacion -> [Stack](ejercicio5/Stack.java)
   - ### a) ¿En que situación es conveniente definir a una clase cómo anónima?
       Es convenible definir una clase anonima cuando sea necesario que no pueda instanciarse una clase de ese estilo y esta contenga un comportamiento que no tiene que ser alterado.
   - ### b) Si tendría que inicializar valores de la clase anónima (cuando se crea una instancia de la misma), ¿cómo lo haría?
       Se podria hacer con un *bloque de inicializacion* que se declara entre `{}`
6. ## Defina una clase llamada Estudiante que contenga las siguientes variables de instancia: apellido, nombre, edad, legajo y materiasAprobadas. Se necesita poder ordenar un arreglo con estos objetos por los siguientes criterios:
   - ### Por cantidad de materias aprobadas en forma ascendente.
   - ### Por edad en forma descendente.
   - ### Por legajo en forma ascendente.
   - ### Por nombre y apellido en forma descendente.
   ## Implemente un método main() que imprima los resultado de las distintas ordenaciones utilizando clases anónimas y el método Arrays.sort().
   ## Solucion -> [Main](ejercicio6/Main.java)
7. ## Uso de Módulos
   ### Retomando la clase Logger que implementaron en el ejercicio 4 de la TP 1, realice ahora un proyecto modular:
   - ### Defina un módulo llamado loggingutils que contenga la clase Logger.
   - ### En cada uno de sus métodos `(logInfo(String mensaje)`, `logWarning(String mensaje)`, `logError(String mensaje))`, en lugar de imprimir directamente en consola, utilice la clase `java.util.logging.Logger` para registrar los mensajes.
        ## Solucion -> [Logger](../../logginutils/src/logginutils/Logger.java)
   - ### ¿Para qué sirve el archivo *module-info.java*? En el módulo *loggingutils*, 
   ¿qué declaración debe incluirse en module-info.java para exponer su paquete al resto de los módulos? Para usar java.util.logging.Logger desde loggingutils, ¿es necesario declarar alguna dependencia en module-info.java? ¿Por qué?
      `module-info.java` define el nombre del módulo. Además, declara qué paquetes se exponen (exports) para que otros módulos puedan usarlos.  
      También permite declarar dependencias (requires) si se usan clases de otros 
    módulos.  
      No, no es necesario por qué el módulo java.base (que incluye java.util) está 
    implicitamente disponible en todos los módulos.
   - ### Luego, cree un segundo módulo llamado test que contenga una clase con el 
   método main(). Desde el main(), utilice el Logger del módulo loggingutils para mostrar los tres tipos de mensajes en la salida. El proyecto debería quedar estructurado de la siguiente manera:
      ```
      project/
      ├--loggingutils/
      │   └--src/
      │     ├-- module-info.java
      │     └-- loggingutils/
      │       └-- Logger.java
      └--test/
          └-- src/
            ├--module-info.java
            └--test/
              └-- Main.java
      ```
    
      ## Solucion -> [Test](../../test/src/test/Main.java)
      ### La documentación de la clase java.util.logging.Logger está disponible en: https://docs.oracle.com/en/java/javase/24/docs/api/java.logging/java/util/logging/Logger.html
8. ## Declaración e implementación de Tipos Enumerativos
   - ### a) Implemente un tipo enumerativo llamado Notas que define los valores de las notas musicales y con su correspondiente cifrado americano (almacenado en un String).
        ## [Notas](ejercicio8/Notas.java)
   - ### b) Implemente un tipo enumerativo llamado FrecuenciasDeLA que represente las siguientes frecuencias estándares de afinación:
     - 440 Hz: Organización Internacional de Estandarización ISO 16.
     - 444 Hz: Afinación de cámara.
     - 446 Hz: Renacimiento.
     - 480 Hz: Órganos alemanes que tocaba Bach.
     
     ## [FrecuenciasDeLa](ejercicio8/FrecuenciasDeLa.java)
   - ### c) Sobrecargue los métodos hacerSonar() y afinar() de la interface InstrumentoMusical del ejercicio 1b) de la práctica 2 de manera que el nuevo hacerSonar(Notas n, int duracion) reciba como parámetro una nota musical y una duración, y el nuevo método afinar(FrecuenciaDeLA f) reciba como parámetro una frecuencia de LA.
     [InstrumentoMusical](ejercicio8/InstrumentoMusical.java)
   - ### d) Defina una clase llamada Piano que implemente la interface InstrumentoMusical y una clase TestPiano que permita probar los métodos implementados.
   - ### e) Implemente el patrón de diseño Singleton mediante un tipo Enumerativo el cual represente a Fito Páez. Fito cuenta con un instrumento musical (piano) y en algún momento se le puede pedir que toque una canción (especificando un arreglo de notas musicales con sus tiempos).