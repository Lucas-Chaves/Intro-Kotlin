package secao_8


fun main() {

    // Colocar ? a variavel pode ser null evitando erros de NullPointerException
    val str: String? = null

    println(str?.length)
    println(str!!.length) // Força a execução deixando cair no erro que no caso é KotlinNullPointerException
}