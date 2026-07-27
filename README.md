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
