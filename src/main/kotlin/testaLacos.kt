fun testaLacos(){

var i = 0;
while (i <= 5) {
    val titular: String = "Ane $i"
    val numeroConta: Int = 1000 + i
    var saldo = i + 10.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()


    for(i in 5 downTo 1 step 2) {
        val titular: String = "Ane $i"
        val numeroConta: Int = 101010 + i
        var saldo: Double = i + 10.0
        saldo += 5000
        saldo -= 100000
//             com string template
        println("titular: " + titular)
//             sem string template
        println("titular:  $titular")
        println("numeroConta:  $numeroConta")
        println("saldo:  $saldo")
        println()

    }
}
