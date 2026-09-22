package `For e While`

fun main() {
    val numero = 6
    var fatorial = 1L

    for (i in numero downTo 1) {
        fatorial *= i
    }

    println("O fatorial de $numero é: $fatorial")
}