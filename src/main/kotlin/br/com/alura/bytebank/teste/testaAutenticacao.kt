import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = br.com.alura.bytebank.modelo.Gerente(
        nome = "Ane",
        cpf = "111.111.111-11",
        salario = 5000.0,
        senha = 1000
    )
    val diretora = br.com.alura.bytebank.modelo.Diretor(
        nome = "Ane2",
        cpf = "222.222.222-22",
        salario = 1000.0,
        senha = 1000,
        plr = 300.0
    )

    val cliente = br.com.alura.bytebank.modelo.Cliente(
        nome = "Ane3",
        cpf = "333.333.333-33",
        senha = 1234
    )
    val sistema = br.com.alura.bytebank.modelo.SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 1000)
    sistema.entra(cliente, 1234)
}