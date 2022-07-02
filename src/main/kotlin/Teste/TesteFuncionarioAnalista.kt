package Teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main(){

    val funcio = Analista(nome = "Daniele Freitas", cpf = "123.456.789-00", salario = 2000.00)
    ImprimeRelatorioFuncionario.imprime(funcio)


}
