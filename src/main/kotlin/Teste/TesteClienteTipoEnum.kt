package Teste

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
//    utilizando IT

    ClienteTipo.values().forEach { it ->
        println(message = "${it.name} - ${it.descricao} ")
    }
//    utilizando elemento
//
//    ClienteTipo.values().forEach { elemento ->
//        println("$ {elemento.nome} - $elemento  ")
//    }

}