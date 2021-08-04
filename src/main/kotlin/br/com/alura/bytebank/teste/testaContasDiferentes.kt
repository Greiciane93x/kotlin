import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {


    val contaCorrente = br.com.alura.bytebank.modelo.ContaCorrente(
      Cliente(nome="Ane", cpf="", senha=1,
      endereco =  Endereco(logradouro = "Rua Helena")
      ), numero = 1000
    )
    val contaPoupanca = br.com.alura.bytebank.modelo.ContaPoupanca(
       Cliente(nome="Alice", cpf="", senha=2), numero = 2000
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
    contaCorrente.transfere(100.0, contaPoupanca, 1);
    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 2)
    println("================================================================")
    println("saldo poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
    println("Endereco...: ${contaCorrente.titular.endereco.logradouro}")
}