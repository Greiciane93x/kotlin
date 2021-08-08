package br.com.alura.bytebank.modelo

class SistemaInterno {

    fun entra(admin: br.com.alura.bytebank.modelo.Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        }else{
            println("Falha na autenticação")
        }
    }


}