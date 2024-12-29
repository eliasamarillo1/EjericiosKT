package EjCurso

/**
 *
 * Pide 2 nuemros por teclado y saca la suma,resta, division y multiplicacion
 * */
fun main() {

    println("indica el operador 1")
    val num = readLine()?.toInt()
    println("inica el numero 2")
    val num2 = readLine()?.toInt()

    println("""indica que operacion quieres realizar: 
        |1.Suma
        | 2.Resta
        | 3 Multiplica
        | 4. divide
    """.trimMargin())

    val op = readLine()?.toInt()
    when(op){
        1-> num?.let {
            if (num2 != null) {
                println( suma(it,num2))
            }
        }
        2-> num2?.let {
            if (num != null) {
                println( resta(num, it))
            }
        }
        3-> num?.let {
            if (num2 != null) {
                println(divide(it,num2))
            }
        }
    }




}
fun suma(num:Int,num2:Int):Int{
    return num + num2
}
fun resta(num:Int, num2:Int):Int{
    return num - num2
}

fun divide (num:Int, num2:Int):Int{
    if (num2==0){
        println("no se puede deviidr por 0")
        return 0
    } else{
        return num/num2

    }
}