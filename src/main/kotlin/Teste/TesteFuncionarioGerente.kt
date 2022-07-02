package Teste

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main(){
    val gerente = Analista(nome = "Dani", cpf = "1234566", salario = 4000.00)

    ImprimeRelatorioFuncionario.imprime(gerente)


}
