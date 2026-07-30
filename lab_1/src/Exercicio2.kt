import java.util.Scanner

fun main(){

    print("Nome do aluno: ")
    val aluno = readln()

    print("Nome da disciplina: ")
    val disciplina = readln()

    var numerosDeNotas: Int
    do {
        print("Numero de notas: ")
        numerosDeNotas = readln().toInt()
        if (numerosDeNotas < 1){
            println("Número de notas inválido")
        }
    } while(numerosDeNotas < 1)

    var media: Int = 0
    var inter: Int = 0
    do {
        var leitura = 1
        print("($leitura) - Nota: ")
        val nota = readln().toInt()
        if (nota > 10 || nota < 0 ){
            println("Nota Inválida, Escreva novamente")
        }else {
            inter ++
            leitura ++;
            media += nota
        }
    } while (inter != numerosDeNotas )
    media = media / numerosDeNotas
    println("Media da disciplina de $disciplina: $media")
}
