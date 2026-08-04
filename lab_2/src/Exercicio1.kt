fun main(){

    var idade : Int;
    do {
        print("Digite sua idade na terra: ")
        idade = readln().toInt()
        if (idade < 0){
            println("Idade nao pode ser negativa")
            println("Tente denovo")
        }
    }while (idade < 0)

    tabelaPlaneta()
    print("Escolha o planeta para ver o equivalente de idade: ")
    var planeta = readln().toInt() ?: 8
    printIdadePlanetas(planeta, idade)

}

fun printIdadePlanetas(planeta: Int, idade: Int){
    val minhaIdade = verificarEquivalente(planeta, idade)
    println("Sua idade nesse planeta é ${"%.2f".format(minhaIdade)}")
}

fun verificarEquivalente(planeta:Int, idade: Int) : Double{
    when (planeta) {
        1 -> return idade / 0.2408467
        2 -> return idade / 0.61519726
        3 -> return idade / 1.8808158
        4 -> return idade / 11.862615
        5 -> return idade / 29.447498
        6 -> return idade / 84.016846
        7 -> return idade / 164.79132
        else -> return idade.toDouble()
    }
}

fun tabelaPlaneta(){
    println("1 - Mercurio")
    println("2 - Venus")
    println("3 - Marte")
    println("4 - Júpiter")
    println("5 - Saturno")
    println("6 - Urano")
    println("7 - Netuno")
    println("8 - Terra")
}