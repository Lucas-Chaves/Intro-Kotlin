package secao_11

class Maquina(var marca: String) {

    var nucleos: Int = 0
        get() {
            println("Alterando manualmente o setter")
            return field
        }
        set(value) {
            println("Alterando o setter manualmente")
            field = value
        }


    fun ligar() {}

    fun processar() {}

    fun desligar() {}


}

fun main() {

    var m: Maquina = Maquina("Dell")


//  nos dois exemplos abaixo ele está chamando a funcionalidade ligar/processar/desligar
//  uma funcionalidade do kotlin para facilitar o uso dos metodos da classe sem precisar ficar chamando a mesma toda hora
    with(m) {
        ligar()
        processar()
        desligar()
    }

    m.ligar()
    m.processar()
    m.desligar()


}