package practica7.ejercicio1

import java.time.LocalTime

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

fun main() {
    val reloj = Reloj()
    reloj.mostrarHora()
}