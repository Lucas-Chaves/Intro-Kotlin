package secao_14

class Constants(){
    companion object BANCO{
        val TABLE = "Pessoa"

        fun teste(){
            println("Sou um metodo estatico.")
        }
    }

//  Obrigatório definir nome.
    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

fun main(){

//  Pode utilizar a classe sem precisar de uma instancia dela.
    println(Constants.TABLE)
    Constants.teste()

    Constants.BANCO.TABLE
    Constants.BANCO.teste()


    Constants.VENDAS.TABLE_NAME
    Constants.VENDAS.COLUNAS.ID
    Constants.VENDAS.COLUNAS.TOTAL

}