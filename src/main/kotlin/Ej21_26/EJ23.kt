package Ej21_26

fun main() {

    println("introduce un numero: ")
    val n = readln().toIntOrNull()

    println(
        n?.let {
            "El numero $it ${if (ormpi(n)) "" else "No"} es un omirp"
        }
    )

}

fun ormpi(n: Int): Boolean =
    primo2(n) && primo2(
        n.toString().reversed().toInt()
    )

fun primo2(num: Int): Boolean = (num >= 2) && (2 until num).none { num % it == 0 }