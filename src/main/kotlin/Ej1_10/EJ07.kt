package Ej1_10

import kotlin.math.abs

/**
 * Determinar el número de cifras de un número entero.
 * El algoritmo debe funcionar para números de hasta 5 cifras, considerando los negativos.
 * Por ejemplo, si se introduce el número 5342, la respuesta del programa debe ser 4.
 * Si se introduce –250, la respuesta debe ser 3.
 */
fun main() {
    println("Introduce un numero: ")
    var cifra = readD()

    println(cifra?.let {
        "el numero $cifra tiene ${count(cifra)} digitos"
    } ?: "numero invalido")

}

fun readD(): Int? = readln().toIntOrNull()

fun count(cifra: Int): Int {
    var cont = 0
    var cifra = abs(cifra)
    while (cifra > 0) {
        cifra /= 10
        cont++
    }
    return cont
}