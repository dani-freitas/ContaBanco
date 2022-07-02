package one.digitalinnovation.digionebank

abstract class Funcionario(

     nome: String,
     cpf: String,
    val salario: Double

    ) : Pessoa(nome, cpf) {


    protected abstract fun CalculoAux(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${CalculoAux()}
    """.trimIndent()

}