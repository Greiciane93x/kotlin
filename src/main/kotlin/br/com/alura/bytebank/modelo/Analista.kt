package br.com.alura.bytebank.modelo

class Analista (

     nome: String,
     cpf: String,
     salario: Double,
  //   val senha: Int
    ): br.com.alura.bytebank.modelo.Funcionario(nome = nome, cpf = cpf, salario = salario){

    override val bonificacao: Double
        get(){
            return salario * 0.1
        }


//    fun autentica(senha: Int): Boolean {
//        if(this.senha == senha){
//            return true
//        }
//        return false
//    }

}