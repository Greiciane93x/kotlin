import br.com.alura.bytebank.modelo.Endereco
import java.util.*

fun main() {

    val endereco = Endereco(logradouro = "Rua Helena",
    cep = "00000-00")
    val enderecoNovo = Endereco(bairro = "Bangu",
    cep = "00000-00")

    // faz a comparação de um objeto é igual ao outro
    // nesse caso, retorna false
    println(endereco.equals(enderecoNovo))
    // nesse caso, retorna true
    println(endereco.equals(endereco))


    // é o "rg" do nosso objeto
    // o hashcode é maneira de identificar o nosso obj
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())


    println(endereco)
    println(enderecoNovo)
    // a representação do nosso objeto
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")


}
//    val objeto: Any = Any()
//    println(endereco)
//
//
//
//    imprime(objeto)
//    imprime(1)
//    imprime(1.0)
//    val teste: Any = imprime(endereco)
//    println(teste)
//
//    testaFuncionarios()
//}


//// sobrecarga
//fun imprime(valor : Any): Any {
//    println(valor)
//    return valor
//}



