package Ej1_10

import kotlin.math.sqrt

/**
 * Calcular la raíz cuadrada de un número introducido por teclado.
 * Hay que tener la precaución de comprobar que el número sea positivo.
 */


fun main() {
    println("Introduce un num: ")
    val number = readln().toIntOrNull()
    print(
        number?.let{
            "la raiz cuadrada de $it es ${raiz(it)} "
        }
    )
}

fun raiz(num:Int):Double = sqrt(num.toDouble())