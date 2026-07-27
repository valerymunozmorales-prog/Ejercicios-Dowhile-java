Investigación del ciclo do-while en Java

El ciclo do-while es una estructura de control repetitiva del lenguaje Java que permite ejecutar un bloque de instrucciones al menos una vez. 
Después de ejecutar ese bloque, el programa evalúa una condición. Si la condición es verdadera, el ciclo vuelve a repetirse. de lo contrario, finaliza.

Sintaxis:

java
do {
    // Instrucciones
} while (condición);

¿Cómo funciona?

El ciclo do-while sigue estos pasos:

1. Ejecuta el bloque de instrucciones.
2. Evalúa la condición.
3. Si la condición es verdadera, vuelve a ejecutar el bloque.
4. Si la condición es falsa, el ciclo termina.

Ejercicios desarrollados

En este repositorio se desarrollan cinco ejemplos utilizando el ciclo do-while en Java:

Ejemplo 1: Validación de Contraseña
Caso de uso: Un sistema de acceso solicita una contraseña al usuario. Mientras la contraseña sea incorrecta, el sistema debe seguir pidiéndola. Cuando sea correcta, mostrará el mensaje "Acceso permitido".

Registro de Notas
Caso de uso

Ejemplo 2: Un instructor necesita registrar las calificaciones de un aprendiz. El sistema debe solicitar notas hasta que el usuario ingrese -1,
indicando que ya no desea registrar más notas.

Entrada esperada
Notas entre 0.0 y 5.0.
El valor -1 para finalizar.
Salida esperada
Cantidad de notas registradas.
Promedio de las notas.

Ejemplo 3: Menú de Cajero Automático
Caso de uso: Un cajero automático muestra un menú con varias opciones.
El menú debe repetirse hasta que el usuario seleccione la opción 4 (Salir).

Ejemplo 4: Registro de Ventas
Caso de uso: Una tienda desea registrar las ventas del día. El programa debe pedir el valor de cada venta y preguntar si desea registrar otra.

Entrada esperada
Valor de la venta.
Respuesta:
S = Registrar otra venta.
N = Finalizar.
Salida esperada
Total de ventas registradas.
Suma total del dinero vendido.

Entrada esperada
Una opción del menú.
Salida esperada
Mostrar un mensaje según la opción elegida.
Finalizar cuando el usuario seleccione la opción 4.

Ejemplo 5: Registro de Estaturas
Caso de uso: En una institución educativa se desea registrar la estatura de varios estudiantes. El programa debe seguir pidiendo estaturas hasta que el usuario decida no ingresar más datos.

Entrada esperada
Estatura en metros.
Respuesta:
S = Continuar.
N = Finalizar.
Salida esperada
Cantidad de estudiantes registrados.
Promedio de estaturas.


