open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
//    // utilizando properties
//    open val bonificacao get() = salario * 0.1

    open fun bonificacao(): Double {return  salario * 0.1  }
}