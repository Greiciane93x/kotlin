class Conta {
    class Conta(
        val titular: String,
        val numero: Int){
        var saldo = 0.0
//
//    constructor(titular: String , numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }
        // properties
//        set(valor){
//            if(valor > 0){
//                field = valor
//            }
//        }


        // uma das regras para criar a classe, é escrevê-la em nível
        // de arquivo
        // é possível criá-la no escopo de funções, ou até mesmo
        // em outras classes

        fun deposita(valor:Double){
            // significa da própria classe
            this.saldo += valor
        }
        fun saca(valor: Double){
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
}