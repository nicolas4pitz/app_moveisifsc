fun main() {
    var idade: Int
    do {
        print("Digite sua idade na terra: ")
        idade = readln().toInt()
        if (idade < 0) {
            println("Idade nao pode ser negativa")
            println("Tente denovo")
        }
    } while (idade < 0)

    tabelaPlaneta()
    val planeta = lerPlanetaValido()

    printIdadePlanetas(idade = idade, planeta = planeta)
}

fun printIdadePlanetas(idade: Int, planeta: Int = 8) {
    val minhaIdade = verificarEquivalente(idade = idade, planeta = planeta)
    println("Sua idade nesse planeta é ${"%.2f".format(minhaIdade)}")
}

fun verificarEquivalente(idade: Int, planeta: Int = 8): Double {
    return when (planeta) {
        1 -> idade / 0.2408467
        2 -> idade / 0.61519726
        3 -> idade / 1.8808158
        4 -> idade / 11.862615
        5 -> idade / 29.447498
        6 -> idade / 84.016846
        7 -> idade / 164.79132
        8 -> idade.toDouble()
        else -> idade.toDouble()
    }
}

fun tabelaPlaneta() {
    println("1 - Mercurio")
    println("2 - Venus")
    println("3 - Marte")
    println("4 - Júpiter")
    println("5 - Saturno")
    println("6 - Urano")
    println("7 - Netuno")
    println("8 - Terra")
}

fun lerPlanetaValido(): Int {
    while (true) {
        print("Escolha o planeta para ver o equivalente de idade: ")
        val entrada = readln().toIntOrNull()
        if (entrada != null && entrada in 1..8) {
            return entrada
        }
        println("Opção inválida! Digite um número de 1 a 8.")
    }
}
