class Pessoa(
    val nome: String,
    val idade: Int,
    val email: String,
    val amigos: MutableList<Pessoa> = mutableListOf()
) {
    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade, email='$email', amigos=${amigos.size})"
    }
}

fun calcularMediaIdade(pessoas: List<Pessoa>): Double {
    if (pessoas.isEmpty()) return 0.0
    return pessoas.map { it.idade }.average()
}

fun calcularTotalAmigos(pessoas: List<Pessoa>): Int {
    return pessoas.sumOf { it.amigos.size }
}

fun main() {
    val p1 = Pessoa("Ana", 25, "ana@email.com")
    val p2 = Pessoa("Bruno", 30, "bruno@email.com")
    val p3 = Pessoa("Carlos", 20, "carlos@email.com")
    val p4 = Pessoa("Daniela", 28, "daniela@email.com")

    p1.amigos.add(p2)
    p1.amigos.add(p3)
    p2.amigos.add(p1)
    p3.amigos.add(p4)

    val listaDePessoas = listOf(p1, p2, p3, p4)

    println(p1)
    println(p2)
    println(p3)
    println(p4)

    println("Média de idade: ${calcularMediaIdade(listaDePessoas)}")
    println("Total de amigos: ${calcularTotalAmigos(listaDePessoas)}")
}
