package br.com.alura.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int) : Boolean
//    {
//        if(this.senha == senha){
//            return true
//        }
//        return false
//    }
}