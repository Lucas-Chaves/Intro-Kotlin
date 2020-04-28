package secao_13

class Quadrado(val area: Float)

data class Triangulo(val area: Float)

fun main() {

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2 = Triangulo(10f)


    //Ele compara se os dois estão no mesmo endereço de memória
    println(q1 == q2)

    //compara o valor que existe dentro deles
    println(t1 == t2)

    //exibe o endereço de memória
    println(q1)

    //exibe o valor que ele está armazenando
    println(t1)

    //faz uma copia da classe com os seus valores
    val t3 = t2.copy()
    println(t3)

}