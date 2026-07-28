import java.util.Scanner

fun main(){



    print("Idade: ")
    val idade = readln().toInt()

    println("Segunda - 1: ")
    println("Terca - 2: ")
    println("Quarta - 3: ")
    println("Quinta - 4: ")
    println("Sexta - 5: ")
    println("Sabado - 6: ")
    println("Domingo - 7: ")
    print("Selecione um numero que represente o dia da semana: ")
    val diaDaSemana = readln().toInt() % 7


    if (idade < 12){
        println("Ingresso custa 10 reais")
    } else if (idade > 60) {
        println("Ingresso custa 12 reais")
    } else {
        if(diaDaSemana in 1..4){
            println("Ingresso custa 20 reais")
        } else{
            println("Ingresso custa 25 reais")
        }
    }
}