package one.digitalinnovation.digionebank.Testes


import java.sql.DriverManager.println

class Pessoa {
    val nome: String = "Dani"
    val cpf: String = "123.134.564-76"
    val endereco: String = "amazonas - 1455"
    val rg: String = "4.581.418"

}

fun main(){
    val eu = Pessoa()
    println (eu.cpf)
    println (eu.nome)
    println (eu.endereco)
    println (eu.rg)
}