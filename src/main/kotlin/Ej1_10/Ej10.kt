package Ej1_10

/**
 * Escribir todos los números impares entre dos números A y B introducidos por teclado.
 * En esta ocasión, cualquier de ellos puede ser el mayor.
 * Habrá que comprobar, entonces, cuál de los dos números, A o B es mayor,
 * para empezar a escribir los impares desde uno o desde otro.
 */

fun main(){
    println("Introduce el primer nnumero")
    val first  = getNumber()?.toInt()
    println( "introduce el segundo numero")
    val second = getNumber()?.toInt()


    println(
        first?.let { a->
            second?.let { b->
                val(menor,mayor) = if(a<b) a to b else b to a
                val list = impares(menor,mayor)
                if(list.isEmpty())"No se han encontrado numeros" else (list.joinToString ())

            }
        }?: "Debes introducir 2 numeros"
    )
}
fun impares(a:Int , b:Int):List<Int> = (a+1..b).filter { it %2!=0 }
