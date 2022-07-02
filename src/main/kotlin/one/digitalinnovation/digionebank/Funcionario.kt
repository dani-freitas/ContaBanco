package one.digitalinnovation.digionebank

class Funcionario(

    override val nome: String,
    override val cpf: String,
    var salario:Double
    ) : Pessoa(nome, cpf) {
}