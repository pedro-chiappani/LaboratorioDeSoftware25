package org.example
import Circuito
import Simulacion
import java.util.concurrent.Executors;

fun main() {
    var c = Circuito()
    val pilotos = listOf("Max Verstappen", "Juan Maria Traverso", "Roberto Mouras", "Agustin Canapino", "Franco Colapinto")
    val simu = Simulacion.prepararSimulacion(c,5, pilotos)
    val executor = Executors.newFixedThreadPool(simu.capacidadPista)
    for (a in simu.autos) {
        executor.execute(a)
    }
        executor.shutdown()

}