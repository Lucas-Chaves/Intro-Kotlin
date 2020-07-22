package secao_14

class Pessoa{

    //Variavel só inicia após uma função da classe ser chamada.
    lateinit var name: String

    fun geradorDeNome(){
        name = "teste"
    }
}

fun main(){

    val p = Pessoa()
    p.geradorDeNome();
}