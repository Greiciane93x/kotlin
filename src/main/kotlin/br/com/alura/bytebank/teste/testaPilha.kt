package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException


fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}
fun funcao2(){
    println("início funcao2")
    try {

        for (i in 1..5) {
            println(i)
            val endereco = Any()
            // throw SaldoInsuficienteException("Saldo é insuficiente, saldo atual $saldo, valor a ser subtraído $valor")

        }
    }catch (e: SaldoInsuficienteException){
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        e.printStackTrace() // reune as 3 informações acima
        println("Nova Exception no Kotlin.. ")
    }
    println("fim funcao2")
}
