package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

var totalContas = 0
private set

abstract class Conta (

        //composição
        val titular: Cliente,
        val numero: Int
        ): Autenticavel {
        var saldo = 0.0
            protected set


        companion object Contador {
            var total  = 0
            private set

        }
//
//        init {
//            println("Criando conta")
//            Contador.total++
//        }

        override fun autentica(senha: Int): Boolean {
            // delegação
            return titular.autentica(senha)
        }

        fun deposita(valor: Double){
            // significa da própria classe
            this.saldo += valor
        }
        abstract fun saca(valor: Double)

        open fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta, senha: Int){

            if(saldo < valor ){
                throw SaldoInsuficienteException("Saldo é insuficiente, saldo atual $saldo, valor a ser subtraído $valor")
            }
            if(!autentica(senha)){
                    throw FalhaAutenticacaoException()
            }
            saldo -= valor
            destino.deposita(valor)

        }
}
