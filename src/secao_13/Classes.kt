package secao_13

class Pessoa1


class Pessoa2(var nome: String, val anoNascimento: Int)


class Pessoa3(var nome: String, val anoNascimento: Int) {
    fun saudacao() {
        println("Ola , meu nome é $nome")
    }
}


fun main() {

    val pessoa: Pessoa3 = Pessoa3("Lucas", 2000)
    println(pessoa.nome)
    println(pessoa.anoNascimento)
    pessoa.saudacao()
}