package `For e While`

fun main() {
    for (progresso in 0..100 step 10) {
        if (progresso == 60) {
            println("Erro no download! Operação cancelada.")
            break
        }
        println("Download em $progresso%")
    }
}
