package secao_13

enum class Prioridade1 {
    BAIXA, MEDIANA, ALTA
}

enum class Prioridade2(val id: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "Super baixa, não se preocupe"
        }
    },
    MEDIANA(5),
    ALTA(10)
}


class Alarme(var desc: String, p: Prioridade2)

fun main() {


    Alarme("Eu moscando", Prioridade2.BAIXA)

    for (p in Prioridade2.values()) {

        println("$p - ${p.id}")
    }
}