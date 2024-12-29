package EjCurso

fun main() {
    val myList = mutableListOf("elias", "amarillo", "eliiii")

    println(myList[1])

    //set -> evitar valores duplicados

    val mySet = setOf("Brasil", "Argentina", "alemania", "Argentina", "Brasil", "alemania")
    println(mySet)

    //mapas ->No ordenada, permites guardar propiedades clave - valor, es decir que siempre a
    //todo lo que vas a guardar una clave

    val myMap = mutableMapOf("elias" to 3 ,  "manuel" to 25)
    println(myMap["elias"])

    myMap["Rosalia" ] = 12

    println("Rosalia")

    //bucles
    var myCounter =0
    while(myCounter < myList.count()){
        println(myList[myCounter])
        myCounter++
    }

    //Opcionales
    var myOptional:String ? = null

    myOptional = "mi cadena de texto opcional "
    println(myOptional)




}
