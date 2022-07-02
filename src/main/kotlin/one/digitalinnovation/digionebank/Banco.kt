package one.digitalinnovation.digionebank

data class Banco(
    val nomeBanco: String = "",
    val numero: Int = 0
){
    fun info() =  "$nomeBanco e $numero"
}



