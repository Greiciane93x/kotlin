package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import testaContasDiferentes


fun testaObjects() {
    val aneObjAnonimous = object : Autenticavel {
        val nome: String = "Ane"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000
        override fun autentica(senha: Int) = this.senha == senha
    }
    val ane = Cliente(nome = "Ane", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = ane, numero = 1000)
    val contaCorrente = ContaCorrente(titular = ane, numero = 1001)

    testaContasDiferentes()

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(aneObjAnonimous, 1000)

    println("nome do cliente: ${aneObjAnonimous.nome}")
    println("Total de contas: ${Conta.total}")
}