package secao_14

// class onde todos que herdam dela utilizam de seus recursos como talk, dormir e peso
abstract class Mamifero(var nome: String){

    var peso: Float  = 0f

    abstract fun talk()
    open fun dormir(){
        println("Estou dormindo!")
    }
}

class Cachorro(nome:String, meuPeso : Float) : Mamifero(nome){

//    forma de atribuir o peso do cachoro para utilizar, init faz a ação antes da classe se instanciada.
    init {
        this.peso = meuPeso
    }

    override fun talk() {
        println("Au au")
    }
}

class Gato(nome:String) : Mamifero(nome){
    override fun talk() {
        println("Miauu")
    }
}


fun main() {
    Cachorro("Zeca", 100f).dormir()
}
