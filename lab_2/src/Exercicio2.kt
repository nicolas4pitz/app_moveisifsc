fun main() {
    println("A temperatura que irá informar, está em qual padrão?")
    tabelaTemperatura()
    val tempOrigem = lerOpcaoValida()

    val temp = lerTemperaturaValida()

    println("Gostaria de transformar em qual padrão?")
    tabelaTemperatura()
    val tempDestino = lerOpcaoValida()

    val conversao = escolherConversao(tempOrigem, tempDestino)

    imprimirTemperatura(temp, tempOrigem, tempDestino, conversao)
}

fun imprimirTemperatura(
    temperatura: Double,
    tempOrigem: Int,
    tempDestino: Int,
    conversao: (Double) -> Double
) {
    val nomeTempOrigem = convertorInternoTemp(tempOrigem)
    val nomeTempDestino = convertorInternoTemp(tempDestino)
    val resultado = conversao(temperatura)
    println("A temperatura $temperatura $nomeTempOrigem é equivalente a $resultado $nomeTempDestino.")
}

fun tabelaTemperatura() {
    println("1 - Celsius")
    println("2 - Fahrenheit")
    println("3 - Kelvin")
}

fun convertorInternoTemp(tempinput: Int): String {
    return when (tempinput) {
        1 -> "Celsius"
        2 -> "Fahrenheit"
        3 -> "Kelvin"
        else -> "Desconhecido"
    }
}

fun lerOpcaoValida(): Int {
    while (true) {
        print("Digite a opção (1, 2 ou 3): ")
        val entrada = readln().toIntOrNull()
        if (entrada != null && entrada in 1..3) {
            return entrada
        }
        println("Opção inválida! Tente novamente.")
    }
}

fun lerTemperaturaValida(): Double {
    while (true) {
        print("Informe a temperatura: ")
        val entrada = readln().toDoubleOrNull()
        if (entrada != null) {
            return entrada
        }
        println("Valor inválido, digite um número real (ex: 25.5).")
    }
}

fun escolherConversao(origem: Int, destino: Int): (Double) -> Double {
    if (origem == destino) return { it }

    return when (origem) {
        1 -> when (destino) {
            2 -> {
                { it * 9 / 5 + 32 }
            }

            3 -> {
                { it + 273.15 }
            }

            else -> {
                { it }
            }
        }

        2 -> when (destino) {
            1 -> {
                { (it - 32) * 5 / 9 }
            }

            3 -> {
                { (it - 32) * 5 / 9 + 273.15 }
            }

            else -> {
                { it }
            }
        }

        3 -> when (destino) {
            1 -> {
                { it - 273.15 }
            }

            2 -> {
                { (it - 273.15) * 9 / 5 + 32 }
            }

            else -> {
                { it }
            }
        }

        else -> {
            { it }
        }
    }
}
