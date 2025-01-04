package Ej11_20

/**
 * Escribe una clase capaz de generar en la pantalla, mediante bucles, unos bonitos diseños.
 */

fun main() {

    isosceles(5)
    rombo(5)
     romboHueco(5)
    arbol()

}

fun isosceles(niveles: Int) {
    (1..niveles).forEach { i ->
        val spaces = " ".repeat(niveles - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)

    }
}

fun isosceles(niveles: Int, indentado: Int) {
    (1..niveles).forEach { i ->
        val spaces = " ".repeat(niveles - 1 + indentado)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
}

fun rombo(niveles: Int) {
    (1..niveles).forEach { i ->
        val spaces = " ".repeat(niveles - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
    ((niveles - 1).downTo(1)).forEach { i ->
        val spaces = " ".repeat(niveles - i)
        val stars = "*".repeat(2 * i - 1)
        println(spaces + stars)
    }
}

fun romboHueco(niveles: Int) {
    (1..niveles).forEach { i ->
        val outSpaces = " ".repeat(niveles - i)
        val innerSpaces = if (i == 1) "" else " ".repeat(2 * i - 3)
        val stars = if (i == 1) "*" else "*$innerSpaces*"
        println(outSpaces + stars)
    }
    ((niveles - 1).downTo(1)).forEach { i ->
        val outspaces = " ".repeat(niveles - i)
        val innerSpaces = if (i == 1) "" else " ".repeat(2 * i - 3)
        val stars = if (i == 1) "*" else "*$innerSpaces*"
        println(outspaces + stars)
    }


}

fun arbol() {
    isosceles(2, )
    isosceles(4, )
    isosceles(7)
    repeat(4) { println("     ***") }
}