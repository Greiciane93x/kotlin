package br.com.alura.bytebank.modelo

var totalContas = 0
private set

abstract class Conta (

        //composição
        val titular: Cliente,
        val numero: Int){
        var saldo = 0.0
            protected set


        companion object Contador {
            var total  = 0
            private set

        }

        init {
            println("Criando conta")
            Contador.total++
        }


        fun deposita(valor:Double){
            // significa da própria classe
            this.saldo += valor
        }
        abstract fun saca(valor: Double)

        open fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta): Boolean{
            if(saldo >= valor){
                saldo -= valor
                destino.deposita(valor)
                return true
            }
            return false
        }
}
