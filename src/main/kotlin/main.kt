import br.com.alura.bytebank.modelo.Endereco

fun main() {
//
//    val endereco = Endereco()
//        .apply{
//            logradouro = "Rua Helena"
//            numero = 316
//        }
//    with(endereco){
//        "$logradouro, $numero".toUpperCase()
//    }.let{enderecoEmMaiusculo: String ->
//         println(enderecoEmMaiusculo)
//    }

    somaReceiver(1, 4, resultado = (:: println))
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    val total = a + b
    total.resultado()
}

