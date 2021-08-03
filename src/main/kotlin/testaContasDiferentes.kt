
fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Ane",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Alice",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("================================================")
    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupanca: ${contaPoupanca.saldo}")

    println("================================================")
    println("tranferindo de uma conta para outra")
    contaCorrente.transfere(100.0, contaPoupanca);
    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)
    println("================================================================")
    println("saldo poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
}