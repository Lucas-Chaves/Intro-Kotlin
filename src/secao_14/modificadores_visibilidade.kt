package secao_8

open class Maquina(val marca: String){
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

//Quando uma classe é declarada como private somente dentro do arquivo você consegue acessar ela.
private class  Computador(marca: String, val nucleos: Int): Maquina(marca){

    override
    fun minhaMarca() {
        println("Estou sobrescrevendo minha função minhaMarca $marca")
        super.minhaMarca()
    }
    fun ligar(){}
    fun processar(){}

    fun overload(i: Int) = println("Sobrecarga 1")
    fun overload(i: Int, s: String) = println("Sobrecarga 2")
    fun overload(i: Int, b: Boolean) = println("Sobrecarga 3")

//  função private somente a classe pode acessar ela.
    private fun validate(){}
}

fun main(){

    val c: Computador = Computador("xpto", 10)
    with(c){
        ligar()
        processar()
        minhaMarca()
        overload(10)
        overload(10, "teste")
        overload(10, true)
    }
}