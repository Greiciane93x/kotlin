package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel (
    titular: Cliente,
    numero: Int
): br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
){
//    override fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta){
//        if(saldo< valor) {
//            throw SaldoInsuficienteException(mensagem= "Saldo é insuficiente, saldo atual $saldo, valor a ser subtraído $valor")
//        }
//            saldo-= valor
//            destino.deposita(valor)
//        }

    override fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta, senha: Int){

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