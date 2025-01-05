package Ej11_20

import java.math.BigInteger

/**
 * La famosa sucesión de Fibonacci es una sucesión no convergente de números enteros que comienza así:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * Cada número de la sucesión se calcula sumando los dos números anteriores
 * (excepto los dos primeros, que son, por definición, 0 y 1).
 * Se da la curiosa circunstancia de que los números de la sucesión de Fibonacci aparecen con sorprendente precisión
 * en muchas estructuras naturales, como los ángulos de crecimiento de las ramas de árboles cuando son iluminados
 * verticalmente, la disposición de los pétalos de los girasoles o de las piñas en los pinos, la forma de las cochas
 * de los caracoles, y cosas así. Si lo piensas, es un poco inquietante que un producto de la imaginación humana
 * como son las matemáticas tenga una relación tan estrecha con la naturaleza.
 * ¿O era al revés? Bueno, al diablo.
 * A lo que íbamos: escribe un programa que muestre en la pantalla los N primeros términos de la sucesión de Fibonacci,
 * siendo N un número entero introducido por el usuario.
 */

fun main() {
    println("Introduce un numero: ")
    val n = readln().toIntOrNull()

    println(
        n?.let {
            fibonacci(it).joinToString()
        } ?: "Numero invalido "
    )
}

fun fibonacci(num: Int): List<BigInteger> {
    val fibonacci = mutableListOf(BigInteger.ZERO, BigInteger.ONE)
    for (i in 1..<num - 1) {
        fibonacci.add(fibonacci[i].add(fibonacci[i - 1]))
    }
    return fibonacci

}