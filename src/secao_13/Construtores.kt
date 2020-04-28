class Pessoa1


class Pessoa2(nome: String) {
    //private setter uma vez que foi definido seu valor não é possivel alteração.
    //somente uma função interna da classe consegue alterar seu valor
    var nome: String = nome
        private set

    fun nomeChange() {
        this.nome = "Lucas Chaves"
    }

    fun saudacao() {
        println("Ola , meu nome é $nome")
        nomeChange()
        println("Ola, seu nome é $nome")
    }
}


class Pessoa3(var nome: String) {

    var ano: Int? = null
    var sobrenome: String = ""

    constructor(nome: String, ano: Int) : this(nome) {
        this.ano = ano
    }

    constructor(nome: String, ano: Int, sobrenome: String) : this(nome, ano) {
        this.sobrenome = sobrenome
    }

    fun saudacao() {
        println("Ola , meu nome é $nome")
        println("$ano")
    }
}


fun main() {

    val p2: Pessoa2 = Pessoa2("Lucas")
    val p1: Pessoa3 = Pessoa3("Lucas", 2000)
    val p3: Pessoa3 = Pessoa3("Lucas", 2000, "chaves")
    // p2.nome = "jorge" --> isso não será possivel pois eu declarei private o setter e kotlin gera de forma implicita getter and setters
    p2.saudacao()


}
