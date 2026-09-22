package `For e While`

fun main() {
    var tentativas = 1

    do {
        println("Tentativa $tentativas: Validando credenciais...")
        tentativas++
    } while (tentativas <=3)
}