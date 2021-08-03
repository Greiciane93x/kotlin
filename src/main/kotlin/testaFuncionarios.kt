fun testaFuncionarios() {
    val ane = Gerente(
        nome = "Ane",
        cpf = "123.123.123.-12",
        salario = 5000.0,
        senha = 12345
    )
    println("==================")
    println("nome: ${ane.nome}")
    println("cpf: ${ane.cpf}")
    println("salario: ${ane.salario}")
//    println("bonificação: ${ane.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("===================")
    println("nome: ${fran.nome}")
    println("cpf: ${fran.cpf}")
    println("salario ${fran.salario}")
//    println("bonificação ${fran.bonificacao()}")

    println("===================")
    if (fran.autentica(1234)) {
        println("[funcionario autenticado com sucesso]")
    } else {
        println("[falha na autenticacao]")
    }
    println("===================")
    val juvenal = Diretor(
        nome = "Juvenal",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    println("===================")
    println("nome: ${juvenal.nome}")
    println("cpf: ${juvenal.cpf}")
    println("salario ${juvenal.salario}")
//    println("bonificação ${juvenal.bonificacao()}")
    println("plr ${juvenal.plr}")

    println("===================")
    if (juvenal.autentica(4000)) {
        println("[funcionario autenticado com sucesso]")
    } else {
        println("[falha na autenticacao]")
    }

    val maria = Analista(nome = "Maria", cpf = "444.444.444-44", salario = 3000.0);

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(ane)
    calculadora.registra(fran)
    calculadora.registra(juvenal)
    calculadora.registra(maria)

    println("total de bonificação: ${calculadora.total}")
}
