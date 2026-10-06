package Lista_de_Exercicios

val calcularGorjeta: (Double?) -> Double = {
    if (it == null || it < 0) {
        0.0
    } else {
        it
    }
}