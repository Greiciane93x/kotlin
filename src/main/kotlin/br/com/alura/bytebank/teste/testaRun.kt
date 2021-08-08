package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal ${taxaMensal}")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Ane", cpf = "111.111.111-11", senha = 1234), 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let(::println)


    run {
        val rendimentoAnual = run {
            var saldo = contaPoupanca.saldo
            repeat(12) {
                saldo += saldo * taxaMensal
            }
            saldo
        }
        println(rendimentoAnual)
    }
}
