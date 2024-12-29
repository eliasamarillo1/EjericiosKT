package org.example.Ejrcicos

import com.sun.org.apache.xpath.internal.operations.Bool


/**
 * Leer un número por teclado mediante un método, y decir si es positivo o negativo con otro método.
 * La salida por consola puede ser algo así como: "el número X es positivo"
 */

fun main() {

    println("introdcue un numero")
    val number = readln().toIntOrNull()
    println(
        number?.let{
            if(esPositivo(it)) "El numero $number es positivo"
            else "El numero $number es negativo"

        }?: "Numero no valido "
    )
}

/**
 * retorna true si el num es positivo
 * */
fun esPositivo(num: Int): Boolean = num > 0

