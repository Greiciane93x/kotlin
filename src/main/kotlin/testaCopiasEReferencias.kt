fun testaCopiasEReferencias(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println()
    println("numeroY $numeroY")


    // Não é uma atribuição, é uma referência de memória
//    val contaJoao = Conta("João", 1000)
//    var contaMaria = contaJoao
//    contaMaria.titular = "Maria"

//    println("titular conta joao: ${contaJoao.titular}")
}
