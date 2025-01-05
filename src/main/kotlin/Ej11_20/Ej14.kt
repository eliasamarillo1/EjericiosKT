package Ej11_20

/**
 * Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998 + 1000.
 */

fun main() {
    println("La suma de todos los pares entre 1 y 1000 es: ${pares().reduce{a,b -> a + b}}")
}

fun pares():List<Int> = (1..1000).filter { it%2 ==0 }
