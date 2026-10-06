package Lista_de_Exercicios

fun limparBancoUsuarios(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0
        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso: Conta inválida/em branco detectada e marcada para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}