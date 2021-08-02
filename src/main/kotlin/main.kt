fun main(){
    println("Bem vindo ao kotlin...")
    // var pode ser modificada, val não
    val titular: String = "Ane"
//    titular = "Teste imutabilidade" [erro de compilação]
//    print(titular)


    val numeroConta: Int = 101010
    var saldo: Double = 0.0
    saldo += 5000
    saldo -= 100000
    // com string template
    // println("titular: " + titular)
    // sem string template
    println("titular:  $titular")
    println("numeroConta:  $numeroConta")
    println("saldo:  $saldo")


    if(saldo > 0.0){
        println("conta é positiva")
    }else if(saldo == 0.0){
        println("conta é neutra")
    }else{
        println("conta é negativa")
    }

    // similar ao switch case
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> {
            println("conta é negativa")
        }
    }
}