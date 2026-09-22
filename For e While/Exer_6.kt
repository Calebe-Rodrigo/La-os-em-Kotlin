package `For e While`

fun main() {
    var somaPares = 0

    for (i in 2..50 step 2) {
        somaPares += i
    }

    println("Resultado: $somaPares")
}