
fun main(){

    println("A temperatura que irá informar, está em qual padrão?")
    tabelaTemperatura()
    val tempOrigem = readln().toInt() % 3

    print("Informe a temperatura: ")
    val temp = readln().toDouble()

    print("Gostaria de transformar em qual padrão?")
    tabelaTemperatura()
    val tempDestino = readln().toInt() % 3

    imprimirTemperatura(temp, tempOrigem, tempDestino)

}

fun imprimirTemperatura(temperatura: Double, tempOrigem: Int, tempDestino: Int, conversao: (Double) -> Double){
    val nomeTempOrigem = convertorInternoTemp(tempOrigem)
    val nomeTempDestino = convertorInternoTemp(tempDestino)
    val resultado = conversao(temperatura)
    println("A temperatura $temperatura $nomeTempOrigem e equivalente a $resultado $nomeTempDestino.")
}


fun tabelaTemperatura(){
    println("1 - Celsius")
    println("2 - Fahrenheit")
    println("3 - Kelvin")
}

fun convertorInternoTemp(tempinput: Int): String{
    when (tempinput){
        1 -> return "Celsius"
        2 -> return "Fahrenheit"
        3 -> return "Kelvin"
    }
}