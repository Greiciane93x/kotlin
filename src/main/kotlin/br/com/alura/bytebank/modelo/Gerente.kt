package br.com.alura.bytebank.modelo

class Gerente (

     nome: String,
     cpf: String,
     salario: Double,
     senha: Int
    ): br.com.alura.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha){

    override val bonificacao: Double
        get(){
            return salario
        }

}