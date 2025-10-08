# Excepciones

**Evento** o **problema** que ocurre durante la **ejecución** de un programa e **interrumpe** el flujo normal de ejecución de instrucciones.

**Interrumpe** el procesamiento normal porque no cuenta con la informacion necesaria para resolver el problema.
Se abandona ese contexto y se pasa a uno de nivel mas alto.

**Java** usa excepciones para porveer el **manejo de errores** a sus programas

Ocurren en los **metodos** y se llevan a cabo los siguientes pasos

1. Se crea un **objeto excepcion** en la **heap** con el operador **new**.
2. Se **lanza** la excepcion, interrumpe la ejecucion del metodo y el objeto _exception_ es expulsado del contexto actual.

En **Java** se clasifican en:

- **Checked Exception** o **Verificables en compilacion**

  Representa problemas con la posibilidad de recuperacion; las aplicaciones se pueden **anticipar** y **recuperar** los errores.
  JAVA obliga a que los metodos que disparen estas excepciones a que **capturen** y **manejen** el error o que lo **propaguen**.

- **Runtime Exception**:

  Son **errores internos** de las aplicaciones que no se pueden **anticipar** ni **recuperar**. En general son _bugs_ del programa y se producen por errores de logica o mal uso de la API de JAVA.

  EJ: division por cero, referencias nulas y error de casting.

- **Error**:

  Errores externos a la aplicacion relacionadas al hardware, falta de memoria y que la aplicacion no puede anticipar ni recuperar.
