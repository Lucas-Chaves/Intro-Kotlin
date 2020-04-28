package secao_9

fun meuNome(nome: String) {
    println("Olá $nome!")
}

fun meuNomeIdade(nome: String, idade: Short) {
    println("Ola $nome, tenho $idade anos.")
}

fun letraIndice(nome: String, indice: Int): Char {
    return nome[indice]
}


// Step into ele vai entrar na função e descrever o que se passa, assim como podemos utilizar a parte de variaveis do debug para poder fazer algumas consultar como length de uma String
fun main() {
    meuNome("Lucas")
    meuNomeIdade("Lucas", 24)
    letraIndice("Lucas", 1)

    val str: String = "alo alo"
    str.toInt()
}