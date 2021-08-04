package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
            private set

    fun registra(funcionario: Any){
         if(funcionario is Funcionario){
             this.total += funcionario.bonificacao
         }else if(funcionario is Int){
             println("o valor deve ser do tipo Funcionario")
         }

    }
//    fun registra(gerente: modelo.Gerente){
//        this.total += gerente.bonificacao()
//    }
//    fun registra(diretor: modelo.Diretor){
//        this.total += diretor.bonificacao()
//    }

}