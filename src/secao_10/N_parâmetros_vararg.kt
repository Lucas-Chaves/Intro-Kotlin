package secao_10

// varargs recebe um tipo definido
fun media(vararg notas: Float) {
    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A media é: ${soma / notas.size} ")
    }
}

//vararg recebe um tipo Any
fun <T> media2(vararg valores: T) {
    for (valor in valores) {
        println(valor)
    }
}

fun main() {
    media(10f, 10f)
    media2(8.4f, "teste", 6, "q")
}