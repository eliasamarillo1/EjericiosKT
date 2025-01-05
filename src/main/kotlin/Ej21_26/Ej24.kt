package Ej21_26


/**
 * Generar combinaciones al azar para la lotería primitiva (6 números entre 1 y 49). Debes utilizar el método
 * Math.random(). Por ahora, no te preocupes porque los números puedan repetirse.
 */


fun main() {
    println("Tu numero es : \n${primitiva().joinToString(" - ")}")
    println("Sin repeticiones: \n${getPrimitivaNoRepeat().joinToString(" - ")}")
}

fun aleatorio() = (Math.random() * 49).toInt() + 1

fun primitiva(): List<Int> = sequence {
    while (true) {
        yield(aleatorio())
    }
}.take(6).toList()

//para no repetir numeros:

fun getPrimitivaNoRepeat():Set<Int>{
    val prim = mutableSetOf<Int>()
    while (prim.size<6){
        prim.add(aleatorio())
    }
    return prim
}