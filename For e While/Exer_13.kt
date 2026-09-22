package `For e While`

fun main() {
    val numero = 29
    var ehPrimo = true

    for (i in 2 until numero) {
        if (numero % i == 0) {
            ehPrimo = false
            break
        }
    }

    if (ehPrimo && numero > 1) {
        println("O número $numero é primo.")
    } else {
        println("O número $numero NÃO é primo.")
    }
}