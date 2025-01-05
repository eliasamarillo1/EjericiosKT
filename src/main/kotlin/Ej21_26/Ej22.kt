package Ej21_26

/**
 * Generalizar el algoritmo anterior para averiguar todos los números primos que existen entre 2 y 1000
 * (a este proceso se le conoce como criba de Eratóstenes, que no es que tenga mayor importancia, pero sirve
 * para ponerle un título interesante a este ejercicio)
 */

fun main() {

    println("Numeros primos entre 2 y 1000")
    println(fisrt1000().joinToString (" - "))

}

fun esPrimO(num: Int): Boolean  = num >= 2
        && (2..num).none { num%it ==0 }
/*
{
   var rango = (2 until num)
    var primo = num >= 2

    for (i in rango) {
        if (num % i == 0) primo = false
    }
    return primo

}  */

fun fisrt1000():List<Int> = (2..1000).filter { esPrimo(it) }