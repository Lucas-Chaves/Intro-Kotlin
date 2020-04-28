package secao_10

//Declarando valores default para a função
fun endereco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0) {
    println("Rua: $rua")
    println("Cidade: $cidade, $estado - $cep")
}


fun main() {
    //Chamando a funcao atraves das variaveis dela
    endereco(cidade = "São José dos Campos", estado = "SP", cep = "205145")
}