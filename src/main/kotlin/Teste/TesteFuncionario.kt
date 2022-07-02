package Teste

import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val funcio = Funcionario(nome = "Daniele Freitas", cpf = "123.456.789-00", salario = 2000.00)

    println(funcio.nome)
    println(funcio.cpf)
    println(funcio.salario)

}