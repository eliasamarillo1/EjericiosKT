package Ej1_10

import kotlin.math.round

/**
 * Averiguar si un número real introducido por teclado tiene o no parte fraccionaria
 * (utilícese el método Math.round() que aparece descrito en el tema 1, o si no, búscalo en Internet)
 */

fun main(){
    println("introduce un numero por teclado ")
    val number = readln().toDoubleOrNull()

    println(
        number?.let{
            if(decimal(number))"el numero $it tiene parte decimal"
            else "$it no tiene parte fraccionaria"
        } ?: "no se ha introducido un numero valido "
    )

}

fun decimal(num:Double):Boolean = num != round(num)



