open class Conta (

        val titular: String,
        val numero: Int){
        var saldo = 0.0
            private set

        fun deposita(valor:Double){
            // significa da própria classe
            this.saldo += valor
        }
        open fun saca(valor: Double){
            if(saldo >= valor){
                this.saldo -= valor
            }
        }
        fun transfere(valor: Double, destino: Conta): Boolean{
            if(saldo >= valor){
                saldo -= valor
                destino.deposita(valor)
                return true
            }
            return false
        }
}
