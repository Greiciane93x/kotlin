fun main() {
//    println("Bem vindo ao kotlin...")
//    var pode ser modificada, val não

//    titular = "Teste imutabilidade" [erro de compilação]
//    print(titular)
//    testaLacos()

    // exemplo de label 
    val contaAne = Conta(titular="Ane",numero = 5000)
    contaAne.saldo = 5000.0
    contaAne.saldo += 300
    println("depositando na conta da Ane")
    contaAne.deposita(500.0)

    val contaAlice = Conta("Alice", 5000)
    contaAlice.saldo = 5000.0
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

class Conta(
    val titular: String,
    val numero: Int){
    var saldo = 0.0
//
//    constructor(titular: String , numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }
        // properties
//        set(valor){
//            if(valor > 0){
//                field = valor
//            }
//        }


    // uma das regras para criar a classe, é escrevê-la em nível
    // de arquivo
    // é possível criá-la no escopo de funções, ou até mesmo
    // em outras classes

    fun deposita(valor:Double){
        // significa da própria classe
        this.saldo += valor
    }
    fun saca(valor: Double){
        if(saldo >= valor){
            this.saldo -= valor
        }
    }
    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println()
    println("numeroY $numeroY")


    // Não é uma atribuição, é uma referência de memória
    val contaJoao = Conta("João", 1000)
    var contaMaria = contaJoao
//    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
}

//fun testaLacos(){
//
//var i = 0;
//while (i <= 5) {
//    val titular: String = "Ane $i"
//    val numeroConta: Int = 1000 + i
//    var saldo = i + 10.0
//
//    println("titular $titular")
//    println("número da conta $numeroConta")
//    println("saldo da conta $saldo")
//    println()
//
//
//    for(i in 5 downTo 1 step 2) {
//        val titular: String = "Ane $i"
//        val numeroConta: Int = 101010 + i
//        var saldo: Double = i + 10.0
//        saldo += 5000
//        saldo -= 100000
////             com string template
//        println("titular: " + titular)
////             sem string template
//        println("titular:  $titular")
//        println("numeroConta:  $numeroConta")
//        println("saldo:  $saldo")
//        println()
//
////    }
//fun testaCondicionais(){
//    if(saldo > 0.0){
//        println("conta é positiva")
//    }else if(saldo == 0.0){
//        println("conta é neutra")
//    }else{
//        println("conta é negativa")
//    }
//}

// similar ao switch case
//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        else -> {
//            println("conta é negativa")
//        }
//    }

//  }
//    }

//}