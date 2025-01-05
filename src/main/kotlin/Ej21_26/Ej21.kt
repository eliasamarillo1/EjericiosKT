package Ej21_26

/**
 * Numeros primos
 * */

fun main(){
    println("Escribe un numero")
    var n = askNumber()

    "El número $n ${if (!isPrimo(n)) "NO " else ""}es primo."

}

fun askNumber(): Int = sequence {
    while(true){
        val n = readln().toIntOrNull()
        if(n!=null)yield(n)
        else println("Numero invalido")
    }
}.first()

fun isPrimo(num:Int):Boolean{
    val range = 2 until num
    var primo = num >= 2
    for (i in range){
        if(num % i == 0) primo = false
    }
    return primo
}

//Opcion decarativa
fun esPrimo(n:Int):Boolean = n>=2 && (2..n).none { n % it ==0 }