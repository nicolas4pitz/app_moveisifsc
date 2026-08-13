abstract class Dispositivo(
    protected val tamanhoDaTela: Double
) {
    protected var telaLigada: Boolean = false

    open fun ligarDesligarTela() {
        telaLigada = !telaLigada
    }
}

interface Dobravel {
    fun dobrar()
    fun desdobrar()
}

class Tablet(
    tamanhoDaTela: Double,
    val marca: String
) : Dispositivo(tamanhoDaTela) {
    override fun toString(): String {
        return "Tablet(marca='$marca', tamanhoDaTela=$tamanhoDaTela, telaLigada=$telaLigada)"
    }
}

class Smartphone(
    tamanhoDaTela: Double,
    val modelo: String
) : Dispositivo(tamanhoDaTela), Dobravel {
    private var estaDobrado: Boolean = false

    override fun ligarDesligarTela() {
        if (estaDobrado && !telaLigada) return
        super.ligarDesligarTela()
    }

    override fun dobrar() {
        estaDobrado = true
        telaLigada = false
    }

    override fun desdobrar() {
        estaDobrado = false
        telaLigada = true
    }

    override fun toString(): String {
        return "Smartphone(modelo='$modelo', tamanhoDaTela=$tamanhoDaTela, telaLigada=$telaLigada, estaDobrado=$estaDobrado)"
    }
}

class Laptop(
    tamanhoDaTela: Double,
    val processador: String
) : Dispositivo(tamanhoDaTela), Dobravel {
    private var estaDobrado: Boolean = true

    override fun ligarDesligarTela() {
        if (estaDobrado && !telaLigada) return
        super.ligarDesligarTela()
    }

    override fun dobrar() {
        estaDobrado = true
        telaLigada = false
    }

    override fun desdobrar() {
        estaDobrado = false
        telaLigada = true
    }

    override fun toString(): String {
        return "Laptop(processador='$processador', tamanhoDaTela=$tamanhoDaTela, telaLigada=$telaLigada, estaDobrado=$estaDobrado)"
    }
}

class Smartwatch(
    tamanhoDaTela: Double,
    val monitorCardiaco: Boolean
) : Dispositivo(tamanhoDaTela) {
    override fun toString(): String {
        return "Smartwatch(monitorCardiaco=$monitorCardiaco, tamanhoDaTela=$tamanhoDaTela, telaLigada=$telaLigada)"
    }
}

fun main() {
    val tablet = Tablet(10.5, "Apple")
    val smartphone = Smartphone(6.7, "Galaxy Fold")
    val laptop = Laptop(15.6, "Intel Core i7")
    val smartwatch = Smartwatch(1.8, true)

    val dispositivos = listOf(tablet, smartphone, laptop, smartwatch)

    tablet.ligarDesligarTela()
    smartphone.desdobrar()
    laptop.desdobrar()
    smartwatch.ligarDesligarTela()
    smartphone.dobrar()

    for (dispositivo in dispositivos) {
        println(dispositivo)
    }
}
