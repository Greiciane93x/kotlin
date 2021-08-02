fun main() {
//    println("Bem vindo ao kotlin...")
//    var pode ser modificada, val não

//    titular = "Teste imutabilidade" [erro de compilação]
//    print(titular)
//    testaLacos()

    val contaAne = Conta()
    contaAne.titular = "Ane"
    contaAne.numero = 1010101
    contaAne.saldo = 5000.0

    val contaAlice = Conta()
    contaAlice.titular = "Alice"
    contaAlice.numero = 101010101
    contaAlice.saldo = 5000.0

    // espaço de memória distintos
    println(contaAne.titular)
    println(contaAne.numero)
    println(contaAne.saldo)

    println()

    println(contaAlice.titular)
    println(contaAlice.numero)
    println(contaAlice.saldo)
}

class Conta{
    var titular = ""
    var numero = 0
    var saldo = 0.0
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