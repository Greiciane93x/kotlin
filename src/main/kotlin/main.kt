import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

 var enderecoNulo: Endereco? =  Endereco(logradouro = "Ocaibi", complemento = "teste")
    val logradouroNovo: String? = enderecoNulo?.logradouro
//    println(enderecoNulo?.logradouro?.length)
    enderecoNulo?.let{
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?:0
        println(tamanhoComplemento)
    }





    val autenticavel  = object : Autenticavel{
        val senha = 1234
        override fun autentica(senha: Int)  = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento") })

}

