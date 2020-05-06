package secao_14

//Open antes do class permite que essa classe seja herdada por outra.
open class Maquina(val marca: String){
    fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

//Passar o tipo que vai receber e passar para a classe herdada como no caso da marca.
class  Computador(marca: String, val nucleos: Int): Maquina(marca){
    fun ligar(){}
    fun processar(){}
}

fun main(){

    val c: Computador = Computador("xpto", 10)
    with(c){
        ligar()
        processar()
        minhaMarca()
    }
}