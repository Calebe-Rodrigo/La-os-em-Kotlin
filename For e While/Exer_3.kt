package `For e While`

fun main() {
    var soma = 0

    for (i in 1..100) {
        soma = soma + i
    }
    println("Resultado: $soma")
}