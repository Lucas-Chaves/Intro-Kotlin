package secao_14

interface Funcionario{
    fun calculaBonus()
}

class Gerente: Funcionario{
    override fun calculaBonus() {
        println("Bonus: 500")
    }

}

class  Tecnico: Funcionario{
    override fun calculaBonus() {
        println("bonus: 200")
    }

}

fun main(){

    val f1: Funcionario = Gerente()
    val f2: Funcionario = Tecnico()

    calculo(f1)
    calculo(f2)
}

fun calculo(funcionario: Funcionario){
    funcionario.calculaBonus()
}