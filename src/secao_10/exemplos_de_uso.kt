package secao_10

fun main() {
    media(10f, 10f)
    media2(8.4f, "teste", 6, "q")


    val str = "Lorem Ipsum"
    str.length
    str.capitalize()
    str.decapitalize()
    str.contains("bla")
    str.startsWith("L")
    str.startsWith("l")


    arrayOf(1, 2, 3, 4, 3)


    //criando uma lista de string sem tamanho definido. -> fora do curso
    val x = mutableListOf<String>()
    x.add(0, "as")
    x.add("ssssss")
    print(x[0])
    print(x[1])
}