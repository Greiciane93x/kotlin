import br.com.alura.bytebank.modelo.Endereco

fun main() {

 var enderecoNulo: Endereco? =  Endereco(logradouro = "Ocaibi", complemento = "teste")
    val logradouroNovo: String? = enderecoNulo?.logradouro
//    println(enderecoNulo?.logradouro?.length)
    enderecoNulo?.let{
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?:0
        println(tamanhoComplemento)
    }
}

fun teste(endereco: Endereco){

}



