abstract class Conta (

        val titular: String,
        val numero: Int){
        var saldo = 0.0
            protected set

        fun deposita(valor:Double){
            // significa da própria classe
            this.saldo += valor
        }
        abstract fun saca(valor: Double)

        open fun transfere(valor: Double, destino: Conta): Boolean{
            if(saldo >= valor){
                saldo -= valor
                destino.deposita(valor)
                return true
            }
            return false
        }
}
