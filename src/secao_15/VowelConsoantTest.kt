package secao_15

import org.junit.Assert
import org.junit.Test


class VowelConsonantTest {

    @Test
    fun countVowels() {
        Assert.assertEquals(11, secao_15.countVowels("Quantas vogais tem esta frase?"))
    }


    @Test
    fun countConsonants() {
        Assert.assertEquals(3, countConsonants("test"))
    }

    @Test
    fun countVowelsAndConsonants() {
        val phrase = "Estou gostando muito de aprender kotlin!"
        Assert.assertEquals(15, countVowels(phrase))
        Assert.assertEquals(19, countConsonants(phrase))
    }

    @Test
    fun countVowelsUpperAndLowerCase(){
        Assert.assertEquals(6, countVowels("EAI, tUdo bem?"))
    }

}