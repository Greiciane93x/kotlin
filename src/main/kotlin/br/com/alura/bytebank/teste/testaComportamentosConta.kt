import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta(){

    val ane = Cliente(nome = "Ane", cpf="", senha=1)
    val contaAne = ContaCorrente(titular = ane, numero = 5000)

    println("depositando na conta da Ane")
    contaAne.deposita(500.0)

    val alice = Cliente(nome="Alice", cpf="", senha=2)

    val contaAlice = br.com.alura.bytebank.modelo.ContaPoupanca(alice, 5000)
    println("depositando na conta da Alice")
    contaAlice.deposita(600.0)

    // espaço de memória distintos
    println(contaAne.titular)
    println(contaAne.numero)
    println(contaAne.saldo)

    println()

    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.saldo)

    println("sacando na conta da Alice")
    contaAlice.saca(500.0)
    println(contaAlice.saldo)

    println("sacando na conta da Ane")
    contaAlice.saca(3000.0)
    println(contaAne.saldo)

    println("Transferência da conta da Alice para conta da Ane")
    if(contaAlice.transfere(2000.0, contaAne)){
        println("Transferência sucedida")
    }else{
        println("Falhou transferência")
    }

    println(contaAlice.saldo)
    println(contaAne.saldo)

}