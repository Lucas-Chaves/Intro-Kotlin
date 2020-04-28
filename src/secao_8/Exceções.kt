package secao_8


fun main() {
    try {
        println("asuhasuh".toInt())
    } catch (e: NumberFormatException) { // Erro especifico
        println(e.message)
    } catch (e: Exception) { // Erro genérico
        println(e)
        println("Ocorreu um erro")
    } finally { //Executa mesmo se ocorrer um erro!
        println("LOL")
    }
}