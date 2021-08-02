fun main(){
    println("Bem vindo ao kotlin...")
    // var pode ser modificada, val não

//    titular = "Teste imutabilidade" [erro de compilação]
//    print(titular)

    for(i in 5 downTo 1 step 2){
            val titular: String = "Ane $i"
            val numeroConta: Int = 101010 + i
            var saldo: Double = i + 10.0
            //saldo += 5000
            // saldo -= 100000
            // com string template
            // println("titular: " + titular)
            // sem string template
            println("titular:  $titular")
            println("numeroConta:  $numeroConta")
            println("saldo:  $saldo")
            println()

                if(saldo > 0.0){
                    println("conta é positiva")
                }else if(saldo == 0.0){
                    println("conta é neutra")
                }else{
                    println("conta é negativa")
                }
        }
    // similar ao switch case
//    when {
//        saldo > 0.0 -> println("conta é positiva")
//        saldo == 0.0 -> println("conta é neutra")
//        else -> {
//            println("conta é negativa")
//        }
//    }
}