package br.com.alura.bytebank.modelo

abstract class ContaTransferivel (
    titular: Cliente,
    numero: Int
): br.com.alura.bytebank.modelo.Conta(
    titular = titular,
    numero = numero
){
    override fun transfere(valor: Double, destino: br.com.alura.bytebank.modelo.Conta): Boolean{
        if(saldo>= valor){
            saldo-= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}