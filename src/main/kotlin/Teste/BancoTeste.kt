package Teste

import one.digitalinnovation.digionebank.Banco

fun main(){

    val digiOneBank = Banco(nomeBanco = "DigitiOne", numero = 12)
    println(digiOneBank.nomeBanco)
    println(digiOneBank.numero)
}