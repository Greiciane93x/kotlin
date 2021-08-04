package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
     nome: String,
     cpf: String,
     salario: Double,
     protected val senha: Int
): br.com.alura.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), br.com.alura.bytebank.modelo.Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}