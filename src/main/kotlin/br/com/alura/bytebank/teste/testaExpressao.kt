package br.com.alura.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    println("início main")

    val entrada: String = "1,9"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Houve um problema ao tentar converter!")
        e.printStackTrace()
        null
    }

    // if expression
    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }
}