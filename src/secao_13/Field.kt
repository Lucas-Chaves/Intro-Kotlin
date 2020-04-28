package secao_13

class Maquina(var marca: String) {

    var nucleos: Int = 0
        get() {
            println("Alterando manualmente o setter")
            return field
        }
        set(value) {
            println("Alterando o setter manualmente")
            field = value
        }

    var ano: Int = 2000
        get() {
            println("Alterando manualmente o setter")
            return field
        }
        //deixando privado o setter para somente consulta do ano da maquina
        private set
}

fun main() {

    var m: Maquina = Maquina("Dell")
    println(m.marca)
    println(m.nucleos)
    m.nucleos = 10
    println(m.nucleos)
    println(m.ano)
//    não é possivel alterar o atributo ano pois o setter é privado, somente a propria classe pode alterar seu valor
//    m.ano = 2001

}