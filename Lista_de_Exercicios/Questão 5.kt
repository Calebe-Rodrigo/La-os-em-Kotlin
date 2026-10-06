package Lista_de_Exercicios

fun avaliarMotorista(nota: Int?) {
    val notaValida = nota ?: 0

    when (notaValida) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota fora do intervalo padrão.")
    }
}