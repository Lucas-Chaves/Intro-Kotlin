package secao_14

interface Maqui{
    fun ligar()
}

class Computer : Maqui{
    override fun ligar() {
        println("Ligando")
    }

}

interface interface1 {
    fun ola(){
        println("Interface 1")
    }
}

interface interface2 {
    fun ola(){
        println("Interface 2")
    }
}

class ImplementaInterface : interface1, interface2{

//    caso exista dois metodos iguais utilizar super<Interface> para escolher qual tu deseja que seja executado.
    override fun ola() {
        super<interface1>.ola()
    }

}
fun main() {

}