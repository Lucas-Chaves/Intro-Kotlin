package secao_12


open class Maquina(val marca: String){
//  funcao precisa estar open para poder ser sobrescrita
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}


class  Computador(marca: String, val nucleos: Int): Maquina(marca){

    override
    fun minhaMarca() {
        println("Estou sobrescrevendo minha função minhaMarca $marca")
        super.minhaMarca()
    }

    fun ligar(){}
    fun processar(){}

    //Sobrecargas
    fun overload(i: Int) = println("Sobrecarga 1")
    fun overload(i: Int, s: String) = println("Sobrecarga 2")
    fun overload(i: Int, b: Boolean) = println("Sobrecarga 3")
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