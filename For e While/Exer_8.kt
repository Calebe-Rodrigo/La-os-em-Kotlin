package `For e While`

fun main() {
    val pratos = listOf("Hambúrguer", "Pizza", "Lasanha", "Salada")
    val itemEsgotado = "Pizza"

    for (prato in pratos) {
        if (prato == itemEsgotado) {
            continue
        }
        println("Item disponível: $prato")
    }
}