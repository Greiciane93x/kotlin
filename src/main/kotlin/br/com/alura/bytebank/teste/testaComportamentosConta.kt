import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

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

    try {
        contaAlice.transfere(destino = contaAne, valor = 5.0, senha = 2)
        println("Transferência sucedida")

    }catch (e: SaldoInsuficienteException){
        println("Falhou transferência")
        println("Saldo Insuficiente")
        e.printStackTrace()
    }catch (e: FalhaAutenticacaoException){
        println("Falha na transferencia")
        println("Falha na autenticação")
    }catch (e: Exception){
        println("erro desconhecido")
    }




    println(contaAlice.saldo)
    println(contaAne.saldo)

}