fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Ane",
        cpf = "111.111.111-11",
        salario = 5000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Ane2",
        cpf = "222.222.222-22",
        salario = 1000.0,
        senha = 1000,
        plr = 300.0
    )

    val cliente = Cliente(
        nome = "Ane3",
        cpf = "333.333.333-33",
        senha = 1234
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 1000)
    sistema.entra(cliente, 1234)
}