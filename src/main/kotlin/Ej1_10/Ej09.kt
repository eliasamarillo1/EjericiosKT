package Ej1_10

/**
 * Ahora sí empiezan los bucles. Escribe un programa que muestre todos los números pares entre A y B,
 * siendo estos dos valores dos números introducidos por teclado. A debe ser menor que B, claro. En caso contrario,
 * el programa debe avisarnos, pero con cariño.
 */

fun main() {

    println("Itroduce un numero :")
    val first = readNumber()
    println("introduce otro numero: ")
    val second = readNumber()

    println(
        first?.let { a ->
            second?.let { b ->
                if (a < b) getPares(a, b).joinToString() else "A debe ser menor que B"
            }
        } ?: "Numero invalido "
    )
}
fun getPares(a: Int, b: Int): List<Int> = (a..b).filter { it % 2 == 0 }
fun readNumber(): Int? = readln().toIntOrNull()