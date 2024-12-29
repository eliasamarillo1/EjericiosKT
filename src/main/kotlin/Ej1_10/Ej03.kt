package Ej1_10

/**
 * Leídos dos números por teclado, llamémosles A y B, calcular y mostrar la resta del mayor menos el menor.
 * Por ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5.
 * Pero si A = 4 y B = 7, el resultado debe ser B – A, es decir, 3.
 */
fun main() {

    println("introduce dos numeros por teclado para realizar una resta ")
    var A = getNumber()
    println("Intorudce el lsegundo numero")
    var B = getNumber()
    var aux:Double

    println  (A?.let{ a->
        B?.let { b ->
            "$a - $b = ${subtract(A,B)}"
        }

    } ?: "Se han nitroducido valores no validos"
    )
}

fun subtract (a:Double, b: Double): Double = a - b

fun getNumber():Double?= readln().toDoubleOrNull()