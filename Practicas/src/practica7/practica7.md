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