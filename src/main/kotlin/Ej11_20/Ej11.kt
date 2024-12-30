package Ej11_20

/**
 * Escribe un programa que pregunte al usuario si desea ver los números pares o impares y que,
 * dependiendo de la respuesta, muestre en la pantalla los números pares o impares entre A y B.
 * Cualquiera de ellos puede ser el mayor
 */
fun main() {
    println("Introduce el primer numero")
    val num1 = read()
    println("introduce el numero 2")
    val num2 = read()

    println(
        num1?.let { num1 ->
            num2?.let { num2 ->
                println(
                    """Elige una opcion 
                    |1.Num pares
                    |2.Num impares
                    |3.Salir
                """.trimIndent()
                )
                val answ = readln()
                val (menor, mayor) = order(num1, num2)

                when (answ) {
                    "1" -> pares(menor, mayor).joinToString()
                    "2" -> impares(menor, mayor).joinToString()
                    else -> "Lfin"

                }
            }
        }
    )
}

fun read(): Int? = readln().toIntOrNull()
fun pares(a: Int, b: Int): List<Int> = (a..b).filter { it % 2 == 0 }
fun impares(a: Int, b: Int): List<Int> = (a..b).filter { it % 2 != 0 }
fun order(a: Int, b: Int) = if (b > a) a to b else b to a
