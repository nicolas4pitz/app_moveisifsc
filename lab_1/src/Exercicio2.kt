import java.util.Scanner

fun main(){

    print("Nome do aluno: ")
    val aluno = readln().toInt()

    print("Nome da disciplina: ")
    val disciplina = readln()

    var numerosDeNotas
    do {
        print("Numero de notas: ")
        numerosDeNotas = readln()
        if (numerosDeNotas < 1){
            println("Número de notas inválido")
        }
    } while(numerosDeNotas < 1)

    var media
    for (i in 1..numerosDeNotas) {
        print("Nota da : ")
        val nota = readln()
        if (nota > 10 || nota < 0 ){
            println("Nota Inválida")
        }else {
            media += nota
        }
    }
}
