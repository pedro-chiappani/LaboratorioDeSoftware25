package practica7.ejercicio3
import kotlin.concurrent.thread
import java.util.concurrent.Executors

class Carrera {


}

fun main(args: Array<String>) {
    val executors = Executors.newFixedThreadPool(5)
    var finish = false
    for (i in 1..5) {
         executors.execute {
            var metros = 0
            while (metros < 100 && !finish ) {
                metros ++

                if (metros == 100) {
                    finish = true
                    println("Carrera: $i - $metros gano")
                } else
                    println("$i - va $metros metros")

            }
            println("Corredor $i hizo $metros metros")
        }
    }

    executors.shutdown()
}
//    for(i in 1 .. 5) {
//        thread() {
//            val name="thread_${i}"
//            var contador = 10
//            for (j in 1..contador) {
//                println("#${name}:${j}")
//                Thread.yield()
//            }
//        }
//}