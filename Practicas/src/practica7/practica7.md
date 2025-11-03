# Temas
- #### Threads. Ciclo de vida.
- #### Sincronización de threads.
- #### Ejecutores

1. ## Implemente en Kotlin una aplicación que muestre la hora actual en consola y la actualice cada 1 segundo. Evalúe distintos mecanismos para hacerlo.
    Solucion:

    ```kotlin
    class Reloj {
        fun mostrarHora(){
            try {
                while (true){
                    println(LocalTime.now().toString().substringBefore("."))
                    Thread.sleep(1000)
                }
            } catch (e: Exception){
                println(e.message)
            }
        } 
    } 
    ```
2. ## Analice el siguiente código Kotlin y responda:
    ```kotlin
    class TestSynchronized(id: String) : Thread(id) {
        var frase: Array<String> = arrayOf("UNLP", "PÚBLICA", "AHORA", "Y", "SIEMPRE")
        override fun run() {
            synchronized(System.out) {
                for (palabra in frase)
                    println("${this.name} : ${palabra} ")
            }
        }
    }
    
    fun main(args: Array<String>) {
        val t1 = TestSynchronized("Thread 1")
        val t2 = TestSynchronized("Thread 2")
        val t3 = TestSynchronized("Thread 3")
        t1.start()
        t2.start()
        t3.start()
    }
    ```
   - ### a) Cual es el efecto del `synchronized(System.out)`?
     - Al entrar en synchronized(System.out) cada hilo intenta adquirir el monitor (la cerradura/monitor) asociado al objeto System.out (el PrintStream compartido). 
     - Sólo el hilo que obtiene ese monitor puede ejecutar el bloque sincronizado; los demás quedan bloqueados hasta que el monitor se libere.
     - En la práctica esto garantiza que la secuencia completa del for y sus println se ejecute de forma atómica respecto a los otros hilos que también sincronicen sobre System.out, evitando la mezcla/intercalado de líneas entre hilos.

     Nota práctica: PrintStream.println ya sincroniza internamente sus operaciones sobre el propio PrintStream, pero aquí se sincroniza toda la iteración (todo el for), con lo cual se evita la intercalación palabra a palabra entre hilos (no sólo cada println individual).

   - ### b) Que tipo de *lock* hace el codigo dado?
     - Es un lock intrínseco/monitor del objeto (object monitor) — el lock proporcionado por la instrucción synchronized de la JVM.
     - Es un lock a nivel de instancia del objeto pasado (en este caso System.out), reentrante (un hilo que ya posee el monitor puede entrar de nuevo) y de exclusión mutua. No es un lock explícito de java.util.concurrent (no es un ReentrantLock de esa API), ni es un lock de clase/static (salvo que se sincronizara sobre la clase).
