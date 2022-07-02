package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Daniele"
    var cpf: String = "123.456.789-00"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}
fun main(){
     var eu = Pessoa()

    println(eu.pessoaInfo())



}