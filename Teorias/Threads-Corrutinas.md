# Threads

- Flujo de control secuencial dentro de un proceso. Se los conoce como _procesos livianos_ o _contextos de ejecucion_.
- Es similar a un programa secuencial:
  - Tiene un comienzo
  - Tiene una secuencia de ejecucion
  - Tiene un final.
  - En un instante de tiempo hay solo un unico punto de ejecucion.
- Se puede hacer uso de multiples threads dentor de un mismo programa ejecutandose simultaneamente y realizando tareas diferentes.
- En el modelo de **multithreading** la CPU le asigna un tiempo a cada thread para que se ejecute; cada thread piensa que tiene la CPU constantemente pero en realidad el tiempo esta dividido entre todos los threads.

- En un programa multithread mas de un thread se ejecuta de manera concurrente. Se va transfiriendo el control de ejecucion entre los diferentes threads, cada uno responsable de distintas tareas.

- Se ejecutan dentro del contexto de un programa y comparte los recursos asignados. Igualmente toma algunos de los recursos del ambiente como propios (pila de ejecucion, contador del programa, codigo y datos).
