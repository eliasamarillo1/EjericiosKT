package Ej11_20

/**
 * El usuario teclea un número y el programa muestra la tabla de multiplicar de este.
 */

fun main() {
    println("introduce un numero: ")
    val num = readln().toIntOrNull()
    num?.let {
        printTablas(it)
    } ?: println("cuack")

}
fun printTablas(numero: Int) = (0..10).forEach { i ->
    var result = i * numero
    println("$i  *  $numero =  $result")
}