package Ej1_10

/**
 * Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.
 * Complétalo con otro método que nos diga si los números, además de estar ordenados, son consecutivos.
 */
fun main() {
    val listNumeros: MutableList<Double> = mutableListOf()


    repeat(3) { i ->
        println("Introduce un numero ${'A' + i}")
        listNumeros.add(readDouble() ?: return println("Numero invalido "))

    }

    println(
        if(isSorted(listNumeros)) "Los numeros están ordenados de menor a mayor"
        else "Los numeros no estan ordenados "
    )

    println(
        if (consecutivo(listNumeros)) "Los numeros son consecutivos"
        else "Los numeros no son consecutivos"
    )

}

fun readDouble(): Double? = readln().toDoubleOrNull()

fun isSorted(lis: MutableList<Double>): Boolean = lis == lis.sorted()

fun consecutivo(list: MutableList<Double>): Boolean {
    for (i in 0..<(list.size - 1)) {
        if (list[i] + 1 != (list[i + 1])) return false
    }
    return true
}